package uk.ac.york.eng2.subscriptions.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.subscriptions.cli.hashtags.*;
import uk.ac.york.eng2.subscriptions.cli.users.*;
import uk.ac.york.eng2.subscriptions.cli.videos.GetVideoByTitleCommand;
import uk.ac.york.eng2.subscriptions.cli.videos.GetVideoCommand;
import uk.ac.york.eng2.subscriptions.cli.videos.GetVideosCommand;

@Command(name = "subscription-cli", description = "...",
        mixinStandardHelpOptions = true,
        subcommands = {
        	GetVideosCommand.class, GetVideoCommand.class, GetUsersCommand.class, GetUserCommand.class,
        	AddHashtagCommand.class, DeleteHashtagCommand.class, GetHashtagCommand.class, GetHashtagsCommand.class,
            AddUserCommand.class, DeleteUserCommand.class, UpdateHashtagCommand.class, GetUserByUsernameCommand.class,
            GetHashtagByNameCommand.class, GetVideoByTitleCommand.class, AddSubscriberCommand.class,
            DeleteSubscriberCommand.class, GetSubscribersCommand.class, GetSubscribedHashtagsByUsernameCommand.class,
            GetHashtaggedCommand.class, GetTopTenVideosByUsernameCommand.class
        })
public class SubscriptionCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(SubscriptionCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
