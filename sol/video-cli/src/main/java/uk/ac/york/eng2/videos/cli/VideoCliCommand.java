package uk.ac.york.eng2.videos.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.videos.cli.hashtags.AddHashtagCommand;
import uk.ac.york.eng2.videos.cli.hashtags.DeleteHashtagCommand;
import uk.ac.york.eng2.videos.cli.hashtags.GetHashtagByNameCommand;
import uk.ac.york.eng2.videos.cli.hashtags.GetHashtagCommand;
import uk.ac.york.eng2.videos.cli.hashtags.GetHashtagsCommand;
import uk.ac.york.eng2.videos.cli.hashtags.GetVideosHashtaggedCommand;
import uk.ac.york.eng2.videos.cli.hashtags.UpdateHashtagCommand;
import uk.ac.york.eng2.videos.cli.users.AddUserCommand;
import uk.ac.york.eng2.videos.cli.users.DeleteUserCommand;
import uk.ac.york.eng2.videos.cli.users.GetUserByUsernameCommand;
import uk.ac.york.eng2.videos.cli.users.GetUserCommand;
import uk.ac.york.eng2.videos.cli.users.GetUsersCommand;
import uk.ac.york.eng2.videos.cli.users.GetVideosUploadedCommand;
import uk.ac.york.eng2.videos.cli.users.UpdateUserCommand;
import uk.ac.york.eng2.videos.cli.videos.AddVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.AddVideoDislikerCommand;
import uk.ac.york.eng2.videos.cli.videos.AddVideoHashtagCommand;
import uk.ac.york.eng2.videos.cli.videos.AddVideoLikerCommand;
import uk.ac.york.eng2.videos.cli.videos.AddVideoViewerCommand;
import uk.ac.york.eng2.videos.cli.videos.DeleteVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.DeleteVideoDislikerCommand;
import uk.ac.york.eng2.videos.cli.videos.DeleteVideoHashtagCommand;
import uk.ac.york.eng2.videos.cli.videos.DeleteVideoLikerCommand;
import uk.ac.york.eng2.videos.cli.videos.DeleteVideoViewerCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoByTitleCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoDislikersCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoHashtagsCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoLikersCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideoViewersCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideosCommand;
import uk.ac.york.eng2.videos.cli.videos.UpdateVideoCommand;

@Command(name = "video-cli", description = "...",
        mixinStandardHelpOptions = true,
        subcommands = {
        	GetVideosCommand.class, GetVideoCommand.class, AddVideoCommand.class, UpdateVideoCommand.class, DeleteVideoCommand.class,
        	GetUsersCommand.class, GetUserCommand.class, AddUserCommand.class, UpdateUserCommand.class, DeleteUserCommand.class,
        	AddVideoViewerCommand.class, GetVideoViewersCommand.class, DeleteVideoViewerCommand.class,
        	AddVideoLikerCommand.class, GetVideoLikersCommand.class, DeleteVideoLikerCommand.class,
        	AddVideoDislikerCommand.class, GetVideoDislikersCommand.class, DeleteVideoDislikerCommand.class,
        	GetVideosUploadedCommand.class, AddHashtagCommand.class, DeleteHashtagCommand.class, GetHashtagCommand.class,
        	GetHashtagsCommand.class, GetVideosHashtaggedCommand.class, UpdateHashtagCommand.class, DeleteVideoHashtagCommand.class,
        	AddVideoHashtagCommand.class, GetVideoHashtagsCommand.class, GetUserByUsernameCommand.class, GetHashtagByNameCommand.class,
        	GetVideoByTitleCommand.class
        })
public class VideoCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(VideoCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
