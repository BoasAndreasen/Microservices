package uk.ac.york.eng2.books.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;

public class BookCliCommandTest {

    @Test
    public void testWithCommandLineOption() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
            String[] args = new String[] { "-v" };
            PicocliRunner.run(BookCliCommand.class, ctx, args);

            // book-cli
            assertTrue(baos.toString().contains("Hi!"));
        }
    }

    @Test
    public void addThenGetBook() throws Exception {
        try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(baos));
            PicocliRunner.run(BookCliCommand.class, ctx, new String[] { "add-book", "Container Security", "2020" });
            assertTrue(baos.toString().contains("CREATED"), "The new book was created");

            baos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(baos));
            PicocliRunner.run(BookCliCommand.class, ctx, new String[] { "get-books" });
            final String newOutput = baos.toString().trim();
			final String[] newLines = newOutput.split(System.lineSeparator());

			int lineNumber = 0;
			assertTrue(newLines.length > 0, "There is at least one line of output");
			for (String line : newLines) {
				++lineNumber;
				assertTrue(line.startsWith("Book"), String.format("Line %d starts with 'Book': %s", lineNumber, line));
			}
        }
    }

}
