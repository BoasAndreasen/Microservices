package uk.ac.york.eng2.books.cli.books;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-book-reader", description="Deletes a reader from a book", mixinStandardHelpOptions = true)
public class DeleteBookReaderCommand implements Runnable {

	@Parameters(index="0")
	private Long bookId;

	@Parameters(index="1")
	private Long userId;

	@Inject
	private BooksClient client;

	@Override
	public void run() {
		HttpResponse<String> response = client.removeReader(bookId, userId);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
	}

}
