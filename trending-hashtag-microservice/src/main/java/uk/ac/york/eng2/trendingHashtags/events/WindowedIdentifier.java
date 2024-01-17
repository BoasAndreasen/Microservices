package uk.ac.york.eng2.trendingHashtags.events;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class WindowedIdentifier {

	private String name;
	private long startMillis, endMillis;

	public WindowedIdentifier() {
		// empty constructor for reflection
	}

	public WindowedIdentifier(String name, Long startMillis, Long endMillis) {
		this.name = name;
		this.startMillis = startMillis;
		this.endMillis = endMillis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStartMillis() {
		return startMillis;
	}

	public void setStartMillis(Long startMillis) {
		this.startMillis = startMillis;
	}

	public Long getEndMillis() {
		return endMillis;
	}

	public void setEndMillis(Long endMillis) {
		this.endMillis = endMillis;
	}

	@Override
	public String toString() {
		return "WindowedIdentifier [name=" + name + ", startMillis=" + startMillis + ", endMillis=" + endMillis + "]";
	}

}
