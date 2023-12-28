package uk.ac.york.eng2.hashtags;

/**
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.books.clients.BooksClient;
import uk.ac.york.eng2.hashtags.domain.Book;
import uk.ac.york.eng2.hashtags.domain.User;
import uk.ac.york.eng2.hashtags.dto.BookDTO;
import uk.ac.york.eng2.hashtags.events.BooksProducer;
import uk.ac.york.eng2.hashtags.repositories.BooksRepository;
import uk.ac.york.eng2.hashtags.repositories.UsersRepository;

 // We have to disable transactions here, as otherwise the controller will not be
 // able to see changes made by the test.
@MicronautTest(transactional = false, environments = "no_streams")
public class BookControllersTest {

	@Inject
	BooksClient client;

	@Inject
	BooksRepository repo;

	@Inject
	UsersRepository userRepo;

	
	 // We mock the Kafka producer here, so we can just test that it's called,
	 // rather than actually checking if the event fully went through.
	 
	private final Map<Long, Book> readBooks = new HashMap<>();

	@MockBean(BooksProducer.class)
	BooksProducer testProducer() {
		return (key, value) -> { readBooks.put(key,  value); };
	}

	@BeforeEach
	public void clean() {
		repo.deleteAll();
		userRepo.deleteAll();
		readBooks.clear();
	}

	@Test
	public void noBooks() {
		Iterable<Book> iterBooks = client.list();
		assertFalse(iterBooks.iterator().hasNext(), "Service should not list any books initially");
	}

	@Test
	public void addBook() {
		final String bookTitle = "Container Security";
		final int bookYear = 2020;

		BookDTO book = new BookDTO();
		book.setTitle(bookTitle);
		book.setYear(bookYear);
		HttpResponse<Void> response = client.add(book);
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Update should be successful");

		List<Book> books = iterableToList(client.list());
		assertEquals(1, books.size());
		assertEquals(bookTitle, books.get(0).getTitle());
		assertEquals(bookYear, books.get(0).getYear());
	}

	@Test
	public void getBook() {
		Book b = new Book();
		b.setTitle("Container Security");
		b.setYear(2020);
		repo.save(b);

		BookDTO bookDTO = client.getBook(b.getId());
		assertEquals(b.getTitle(), bookDTO.getTitle(), "Title should be fetched correctly");
		assertEquals(b.getYear(), bookDTO.getYear(), "Year should be fetched correctly");
	}

	@Test
	public void getMissingBook() {
		BookDTO response = client.getBook(0);
		assertNull(response, "A missing book should produce a 404");
	}

	@Test
	public void updateBook() {
		Book b = new Book();
		b.setTitle("Container Security");
		b.setYear(2020);
		repo.save(b);

		final String newTitle = "New Title";
		BookDTO dtoTitle = new BookDTO();
		dtoTitle.setTitle(newTitle);
		HttpResponse<Void> response = client.updateBook(b.getId(), dtoTitle);
		assertEquals(HttpStatus.OK, response.getStatus());

		b = repo.findById(b.getId()).get();
		assertEquals(newTitle, b.getTitle());
	}

	@Test
	public void deleteBook() {
		Book b = new Book();
		b.setTitle("Container Security");
		b.setYear(2020);
		repo.save(b);

		HttpResponse<Void> response = client.deleteBook(b.getId());
		assertEquals(HttpStatus.OK, response.getStatus());
		
		assertFalse(repo.existsById(b.getId()));
	}

	@Test
	public void noBookReaders() {
		Book b = new Book();
		b.setTitle("Container Security");
		b.setYear(2020);
		repo.save(b);

		List<User> readers = iterableToList(client.getReaders(b.getId()));
		assertEquals(0, readers.size(), "Books should not have any readers initially");
	}

	@Test
	public void oneBookReader() {
		Book b = new Book();
		b.setTitle("Container Security");
		b.setYear(2020);
		b.setReaders(new HashSet<>());
		repo.save(b);

		User u = new User();
		u.setUsername("antonio");
		userRepo.save(u);

		b.getReaders().add(u);
		repo.update(b);

		List<User> response = iterableToList(client.getReaders(b.getId()));
		assertEquals(1, response.size(), "The one reader that was added should be listed");
	}

	@Test
	public void addBookReader() {
		Book b = new Book();
		b.setTitle("Container Security");
		b.setYear(2020);
		repo.save(b);

		final String readerUsername = "alice";
		User u = new User();
		u.setUsername(readerUsername);
		userRepo.save(u);

		final Long bookId = b.getId();
		HttpResponse<String> response = client.addReader(bookId, u.getId());
		assertEquals(HttpStatus.OK, response.getStatus(), "Adding reader to the book should be successful");

		// Check the producer was called by the addition
		assertTrue(readBooks.containsKey(bookId));

		b = repo.findById(bookId).get();
		assertEquals(1, b.getReaders().size(), "Book should now have 1 reader");
		assertEquals(readerUsername, b.getReaders().iterator().next().getUsername());
	}

	@Test
	public void deleteBookReader() {
		Book b = new Book();
		b.setTitle("Container Security");
		b.setYear(2020);
		b.setReaders(new HashSet<>());
		repo.save(b);

		User u = new User();
		u.setUsername("antonio");
		userRepo.save(u);

		b.getReaders().add(u);
		repo.update(b);

		HttpResponse<String> response = client.removeReader(b.getId(), u.getId());
		assertEquals(HttpStatus.OK, response.getStatus(), "Removing reader to the book should be successful");

		b = repo.findById(b.getId()).get();
		assertTrue(b.getReaders().isEmpty(), "Book should have no readers anymore");
	}

	private <T> List<T> iterableToList(Iterable<T> iterable) {
		List<T> l = new ArrayList<>();
		iterable.forEach(l::add);
		return l;
	}
}
 */

