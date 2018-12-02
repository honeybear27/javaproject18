package lrurunway;

public class Rocket extends AirObject{
	private String destination;
	private int capacity;
	
	public Rocket(String name, String company, int year, int maxHeight, String destination, int capacity) {
		super(name, company, year, maxHeight);
		this.destination = destination;
		this.capacity = capacity;
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
		if (newCapacity >= 0 && newCapacity <= 10) {
			capacity = newCapacity;
		}
	}
	
	public String toString() {
		return "Rocket : [" + super.getName() + "] [" + super.getCompany() + "] [" + super.getYear() + "] [" + super.getMaxHeight() + "] [" + destination + "] ["
				+ capacity + "]";
	}
	
}
