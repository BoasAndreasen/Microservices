package uk.ac.york.eng2.hashtags;

/**
 * import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KafkaStreams.State;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Requires;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.hashtags.domain.Book;
import uk.ac.york.eng2.hashtags.events.BooksProducer;
import uk.ac.york.eng2.hashtags.events.BooksStreams;
import uk.ac.york.eng2.hashtags.events.WindowedIdentifier;

@Property(name = "spec.name", value="MicronautStreamsTest")
@TestInstance(Lifecycle.PER_CLASS)
@MicronautTest
public class MicronautStreamsTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(MicronautStreamsTest.class);

	@Inject
	BooksProducer producer;

	@Inject
	KafkaStreams kStreams;

	private static final Map<WindowedIdentifier, Long> events = new HashMap<>();

	@BeforeEach
	public void setUp() {
		events.clear();
		Awaitility.await().until(() -> kStreams.state().equals(State.RUNNING));
		LOGGER.info("Kafka Streams is RUNNING");
	}

	@AfterAll
	public void cleanUp() {
		 // This is needed because the automated Kafka Streams shutdown process from
		 // Micronaut Kafka only waits for 3 seconds at most, which may not be enough
		 // in some cases when we have actually started Kafka Streams (i.e. we are
		 // not using the no_streams environment), like in this test.
		 // See here:
		 //https://github.com/micronaut-projects/micronaut-kafka/issues/901
		kStreams.close();
	}

	@Test
	public void readEventUpdatesCount() {
		LOGGER.info("About to send event");
		producer.readBook(1L, new Book());
		LOGGER.info("Sent event");

		// We could do a more advanced test with various counts, but this just checks
		// that a "book read" record produces an update record in the target stream
		Awaitility.await()
			.atMost(Duration.ofSeconds(30))
			.until(() -> !events.isEmpty());
	}

	@Requires(property = "spec.name", value = "MicronautStreamsTest")
	@KafkaListener(groupId = "micronaut-streams-test")
	static class StreamsListener {

		@Topic(BooksStreams.TOPIC_READ_BY_DAY)
		public void bookReadMetric(@KafkaKey WindowedIdentifier window, Long count) {
			LOGGER.info("Received event: {}", window);
			events.put(window, count);
		}
	}
}
 */

