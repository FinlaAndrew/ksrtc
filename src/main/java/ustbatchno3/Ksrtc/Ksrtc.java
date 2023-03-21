package ustbatchno3.Ksrtc;

import java.time.LocalDateTime;

public class Ksrtc {
	private String source;
	private String destination;
	private int fare;
	private LocalDateTime deptime;
	public Ksrtc(String source, String destination, int fare, LocalDateTime deptime) {
		super();
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.deptime = deptime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public LocalDateTime getDeptime() {
		return deptime;
	}
	public void setDeptime(LocalDateTime deptime) {
		this.deptime = deptime;
	}
	@Override
	public String toString() {
		return "Ksrtc [source=" + source + ", destination=" + destination + ", fare=" + fare + ", deptime=" + deptime
				+ "]";
	}
	
}
