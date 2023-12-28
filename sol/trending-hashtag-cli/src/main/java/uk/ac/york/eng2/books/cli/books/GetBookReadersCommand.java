package uk.ac.york.eng2.books.cli.books;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.books.cli.domain.User;

@Command(name="get-book-readers", description="Gets the readers of a specific book", mixinStandardHelpOptions = true)
public class GetBookReadersCommand implements Runnable {

	@Inject
	private BooksClient client;

	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {
		Iterable<User> users = client.getReaders(id);
		for (User user : users) {
			System.out.println(user);
		}
	}
	
}
