package uk.ac.york.eng2.books.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class BookDTO {

	private String title;
	private Integer year;

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
		return "BookDTO [title=" + title + ", year=" + year + "]";
	}

}
