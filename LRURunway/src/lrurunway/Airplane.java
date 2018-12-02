package lrurunway;

public class Airplane extends AirObject{
	private String destination;
	private int capacity;
	private String pilot;
	
	public Airplane(String name, String company, int year, int maxHeight, String destination, int capacity, String pilot) {
		super(name, company, year, maxHeight);
		this.destination = destination;
		this.capacity = capacity;
		this.pilot = pilot;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String newDestination) {
		destination = newDestination;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int newCapacity) {
		if (newCapacity > 0 && newCapacity < 100) {
			capacity = newCapacity;
		}
	}
	
	public String getPilot() {
		return pilot;
	}
	
	public void setPilot(String newPilot) {
		pilot = newPilot;
	}
	
	public String toString() {
		return "Airplane : [" + super.getName() + "] [" + super.getCompany() + "] [" + super.getYear() + "] [" + super.getMaxHeight() + "] [" + destination + "] ["
				+ capacity + "] [" + pilot + "]";
	}
}
