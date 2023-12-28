package uk.ac.york.eng2.books.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.books.cli.books.AddBookCommand;
import uk.ac.york.eng2.books.cli.books.AddBookReaderCommand;
import uk.ac.york.eng2.books.cli.books.DeleteBookCommand;
import uk.ac.york.eng2.books.cli.books.DeleteBookReaderCommand;
import uk.ac.york.eng2.books.cli.books.GetBookCommand;
import uk.ac.york.eng2.books.cli.books.GetBookReadersCommand;
import uk.ac.york.eng2.books.cli.books.GetBooksCommand;
import uk.ac.york.eng2.books.cli.books.UpdateBookCommand;
import uk.ac.york.eng2.books.cli.users.AddUserCommand;
import uk.ac.york.eng2.books.cli.users.DeleteUserCommand;
import uk.ac.york.eng2.books.cli.users.GetUserCommand;
import uk.ac.york.eng2.books.cli.users.GetUsersCommand;
import uk.ac.york.eng2.books.cli.users.UpdateUserCommand;

@Command(name = "book-cli", description = "...",
        mixinStandardHelpOptions = true,
        subcommands = {
        	GetBooksCommand.class, GetBookCommand.class, AddBookCommand.class, UpdateBookCommand.class, DeleteBookCommand.class,
        	GetUsersCommand.class, GetUserCommand.class, AddUserCommand.class, UpdateUserCommand.class, DeleteUserCommand.class,
        	AddBookReaderCommand.class, GetBookReadersCommand.class, DeleteBookReaderCommand.class
        })
public class BookCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(BookCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
