package uk.ac.york.eng2.trendingHashtags.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.trendingHashtags.cli.hashtags.Get10TrendingHashtagsCommand;
import uk.ac.york.eng2.trendingHashtags.cli.hashtags.GetTrendingHashtagsCommand;


@Command(name = "trendingHashtag-cli", description = "...",
        mixinStandardHelpOptions = true,
        subcommands = {
        	GetTrendingHashtagsCommand.class, Get10TrendingHashtagsCommand.class
        })
public class TrendingHashtagCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(TrendingHashtagCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
