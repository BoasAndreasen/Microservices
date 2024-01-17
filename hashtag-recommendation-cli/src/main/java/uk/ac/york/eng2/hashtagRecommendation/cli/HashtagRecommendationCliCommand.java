package uk.ac.york.eng2.hashtagRecommendation.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.hashtagRecommendation.cli.hashtags.*;

@Command(name = "hashtagRecommendation-cli", description = "...",
        mixinStandardHelpOptions = true,
        subcommands = {
            GetHashtagsCommand.class, GetHashtagByNameCommand.class
        })
public class HashtagRecommendationCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(HashtagRecommendationCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
