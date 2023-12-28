package uk.ac.york.eng2.books.cli.books;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="add-book-reader", description="Adds a reader to a book", mixinStandardHelpOptions = true)
public class AddBookReaderCommand implements Runnable {

	@Inject
	private BooksClient client;

	@Parameters(index="0")
	private Long bookId;

	@Parameters(index="1")
	private Long userId;

	@Override
	public void run() {
		HttpResponse<String> response = client.addReader(bookId, userId);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
	}

}
