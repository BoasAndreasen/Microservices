package uk.ac.york.eng2.hashtags;


/**
 * 
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.awaitility.Awaitility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.books.clients.BooksClient;
import uk.ac.york.eng2.hashtags.domain.Book;
import uk.ac.york.eng2.hashtags.domain.User;
import uk.ac.york.eng2.hashtags.events.BooksProducer;
import uk.ac.york.eng2.hashtags.repositories.BooksRepository;
import uk.ac.york.eng2.hashtags.repositories.UsersRepository;


 // This is an integration test between our producer and Kafka itself: we actually
 // subscribe to the Kafka topic and see if the record is produced. It is an
 // asynchronous process, so we have to use the Awaitility library to describe
 // these expectations.

@Property(name = "spec.name", value = "KafkaProductionTest")
@MicronautTest(transactional = false, environments = "no_streams")
public class KafkaProductionTest {

	@Inject
	BooksClient client;

	@Inject
	BooksRepository repo;


	@Inject
	UsersRepository userRepo;

	private static final Map<Long, Book> readBooks = new HashMap<>();

	@BeforeEach
	public void setUp() {
		repo.deleteAll();
		userRepo.deleteAll();
		readBooks.clear();
	}

	@Test
	public void addBookReader() {
		Book b = new Book();
		b.setTitle("Container Security");
		b.setYear(2020);
		repo.save(b);

		User u = new User();
		u.setUsername("antonio");
		userRepo.save(u);

		final Long bookId = b.getId();
		HttpResponse<String> response = client.addReader(bookId, u.getId());
		assertEquals(HttpStatus.OK, response.getStatus(), "Adding reader to the book should be successful");

		// Check the event went to Kafka and back
		Awaitility.await()
			.atMost(Duration.ofSeconds(30))
			.until(() -> readBooks.containsKey(bookId));
	}

	@Requires(property = "spec.name", value = "KafkaProductionTest")
	@KafkaListener(groupId = "kafka-production-test")
	static class TestConsumer {
		@Topic(BooksProducer.TOPIC_READ)
		void readBook(@KafkaKey Long id, Book book) {
			readBooks.put(id, book);
		}
	}

}
 */

