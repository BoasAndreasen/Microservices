package uk.ac.york.eng2.books.cli.books;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.books.cli.domain.Book;

@Command(name="get-books", description="Gets all the books", mixinStandardHelpOptions = true)
public class GetBooksCommand implements Runnable {

	@Inject
	private BooksClient client;

	@Override
	public void run() {
		for (Book b : client.list()) {
			System.out.println(b);
		}
	}

}
