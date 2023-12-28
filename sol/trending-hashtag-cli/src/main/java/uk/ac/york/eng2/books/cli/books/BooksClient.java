package uk.ac.york.eng2.books.cli.books;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.books.cli.domain.Book;
import uk.ac.york.eng2.books.cli.domain.User;
import uk.ac.york.eng2.books.cli.dto.BookDTO;

@Client("${books.url:`http://localhost:8080/books`}")
public interface BooksClient {

	@Get("/")
	Iterable<Book> list();

	@Post("/")
	HttpResponse<Void> add(@Body BookDTO bookDetails);

	@Get("/{id}")
	BookDTO getBook(long id);

	@Put("/{id}")
	HttpResponse<Void> updateBook(long id, @Body BookDTO bookDetails);

	@Delete("/{id}")
	HttpResponse<Void> deleteBook(long id);

	@Get("/{id}/readers")
	public Iterable<User> getReaders(long id);

	@Put("/{bookId}/readers/{userId}")
	public HttpResponse<String> addReader(long bookId, long userId);	

	@Delete("/{bookId}/readers/{userId}")
	public HttpResponse<String> removeReader(long bookId, long userId);
}
