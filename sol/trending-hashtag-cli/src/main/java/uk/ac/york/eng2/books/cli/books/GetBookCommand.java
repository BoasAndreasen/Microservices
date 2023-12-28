package uk.ac.york.eng2.books.cli.books;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.books.cli.dto.BookDTO;

@Command(name="get-book", description="Gets a specific book", mixinStandardHelpOptions = true)
public class GetBookCommand implements Runnable {

	@Inject
	private BooksClient client;

	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {
		BookDTO book = client.getBook(id);
		if (book == null) {
			System.err.println("Book not found!");
			System.exit(1);
		} else {
			System.out.println(book);
		}
	}

	
}
