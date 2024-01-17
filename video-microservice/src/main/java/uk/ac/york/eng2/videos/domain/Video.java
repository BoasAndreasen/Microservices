package uk.ac.york.eng2.videos.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public class Video {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String title;

	@JoinTable(name = "video_uploader")
	@ManyToOne()
	private User uploader;

	
	@JoinTable(
	    name = "video_hashtags",
	    joinColumns = @JoinColumn(name = "video_id"),
	    inverseJoinColumns = @JoinColumn(name = "hashtag_id")
	)
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Hashtag> hashtags;

	@JsonIgnore
	@JoinTable(name = "video_user_viewed")
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<User> viewers;

	@JsonIgnore
	@JoinTable(name = "video_user_liked")
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<User> likers;

	@JsonIgnore
	@JoinTable(name = "video_user_disliked")
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<User> dislikers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUploader() {
		return uploader;
	}

	public void setUploader(User uploader) {
		this.uploader = uploader;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<User> getViewers() {
		return viewers;
	}

	public void setViewers(Set<User> viewers) {
		this.viewers = viewers;
	}

	public Set<User> getLikers() {
		return likers;
	}

	public void setLikers(Set<User> likers) {
		this.likers = likers;
	}

	public Set<User> getDislikers() {
		return dislikers;
	}

	public void setDislikers(Set<User> dislikers) {
		this.dislikers = dislikers;
	}

	public Set<Hashtag> getHashtags() {
		return hashtags;
	}

	public void setHashtags(Set<Hashtag> hashtags) {
		this.hashtags = hashtags;
	}

}
