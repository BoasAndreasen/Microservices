package uk.ac.york.eng2.books.cli.books;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.books.cli.dto.BookDTO;

@Command(name="add-book", description="Adds a book", mixinStandardHelpOptions = true)
public class AddBookCommand implements Runnable {

	@Inject
	private BooksClient client;

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private Integer year;

	@Override
	public void run() {
		BookDTO dto = new BookDTO();
		dto.setTitle(title);
		dto.setYear(year);

		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}

}
