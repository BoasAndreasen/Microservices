package uk.ac.york.eng2.books.cli.books;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-book", description="Deletes a book", mixinStandardHelpOptions = true)
public class DeleteBookCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Inject
	private BooksClient client;

	@Override
	public void run() {
		HttpResponse<Void> response = client.deleteBook(id);
		System.out.println("Server responded with: " + response.getStatus());
	}

}
