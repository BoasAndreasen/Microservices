package uk.ac.york.eng2.trendingHashtags.events;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.kafka.streams.KeyValue;


@Factory
public class TrendingHashtagsStreams {

	public static final String TOPIC_LIKED_BY_DAY = "video-liked-by-day";

	@Inject
	private SerdeRegistry serdeRegistry;

	@Singleton
	public KStream<WindowedIdentifier, Long> readByDay(ConfiguredStreamBuilder builder) {		
		Properties props = builder.getConfiguration();
		props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE);

		KStream<String, String> videosStream = builder
				.stream(TrendingHashtagsProducer.TOPIC_LIKED, Consumed.with(Serdes.String(), Serdes.String()))
				.peek((key, value) -> System.out.println("HEY Key: " + key + ", Value: " + value));;
		
		KStream<String, Long> hashtagStream = videosStream
				.flatMap((key, value) -> {
					try {
						HashSet<String> hashtags = new ObjectMapper().readValue(value, new TypeReference<HashSet<String>>() {});
						return hashtags.stream().map(hashtag -> KeyValue.pair(hashtag, 1L)).collect(Collectors.toList());
					} catch (IOException e) {
						e.printStackTrace();
						return Collections.emptyList();
					}
				})
				.peek((key, value) -> System.out.println("HEY2 Key: " + key + ", Value: " + value));
		
		KStream<WindowedIdentifier, Long> stream = hashtagStream
				.groupByKey(Grouped.with(Serdes.String(), Serdes.Long()))
				.windowedBy(SlidingWindows.withTimeDifferenceAndGrace(Duration.ofHours(1), Duration.ofSeconds(1)))
				.count(Materialized.as("video-liked-by-day"))
				.toStream()
				.filter((key, value) -> key.window().endTime().isAfter(Instant.now().minus(Duration.ofHours(1)))) // Filter out old windows
				.map((key, value) -> new KeyValue<>(new WindowedIdentifier(key.key(), key.window().start(), key.window().end()), value))
				.peek((key, value) -> System.out.println("HEY3 Key: " + key + ", Value: " + value));

		
		stream.to(TOPIC_LIKED_BY_DAY, Produced.with(serdeRegistry.getSerde(WindowedIdentifier.class), Serdes.Long()));
				
		return stream;
	}
}
