package uk.ac.york.eng2.books.cli.books;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.books.cli.dto.BookDTO;

@Command(name="update-book", description="Updates a book", mixinStandardHelpOptions = true)
public class UpdateBookCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Option(names = {"-t", "--title"}, description="Title of the book")
	private String title;

	@Option(names = {"-y", "--year"}, description="Year the book was published")
	private Integer year;

	@Inject
	private BooksClient client;

	@Override
	public void run() {
		BookDTO bookDetails = new BookDTO();
		if (title != null) {
			bookDetails.setTitle(title);
		}
		if (year != null) {
			bookDetails.setYear(year);
		}
		
		HttpResponse<Void> response = client.updateBook(id, bookDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}
