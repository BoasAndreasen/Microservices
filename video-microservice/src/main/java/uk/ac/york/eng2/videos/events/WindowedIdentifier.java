package uk.ac.york.eng2.videos.events;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class WindowedIdentifier {

	private Long id, startMillis, endMillis;

	public WindowedIdentifier() {
		// empty constructor for reflection
	}

	public WindowedIdentifier(Long id, Long startMillis, Long endMillis) {
		this.id = id;
		this.startMillis = startMillis;
		this.endMillis = endMillis;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "WindowedIdentifier [id=" + id + ", startMillis=" + startMillis + ", endMillis=" + endMillis + "]";
	}

}
