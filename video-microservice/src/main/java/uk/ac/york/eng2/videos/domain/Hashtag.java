package uk.ac.york.eng2.videos.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public class Hashtag {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	    name = "video_hashtags",
	    joinColumns = @JoinColumn(name = "hashtag_id"),
	    inverseJoinColumns = @JoinColumn(name = "video_id")
	)
	private Set<Video> hashtaggedVideos;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Video> getHashtaggedVideos() {
		return hashtaggedVideos;
	}

	public void setHashtaggedVideos(Set<Video> hashtaggedVideos) {
		this.hashtaggedVideos = hashtaggedVideos;
	}

}
