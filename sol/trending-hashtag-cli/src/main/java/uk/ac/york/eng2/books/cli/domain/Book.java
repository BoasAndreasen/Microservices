package uk.ac.york.eng2.books.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Book {

	private Long id;
	private String title;
	private Integer year;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", year=" + year + "]";
	}

}
