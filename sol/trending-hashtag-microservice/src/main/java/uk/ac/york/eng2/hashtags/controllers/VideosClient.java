package uk.ac.york.eng2.hashtags.controllers;


import java.util.List;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.hashtags.domain.Hashtag;

@Client("http://localhost:8080")
public interface VideosClient {

    @Get("/videos/{videoId}/hashtags")
    List<Hashtag> getHashtagsForVideo(Long videoId);
}