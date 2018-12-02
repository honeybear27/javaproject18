package lrurunway;

// TODO: Auto-generated Javadoc
/**
 * The Class Rocket.
 */
public class Rocket extends AirObject{
	
	/** The destination. */
	private String destination;
	
	/** The capacity. */
	private int capacity;
	
	/**
	 * Instantiates a new rocket.
	 *
	 * @param name the name
	 * @param company the company
	 * @param year the year
	 * @param maxHeight the max height
	 * @param destination the destination
	 * @param capacity the capacity
	 */
	public Rocket(String name, String company, int year, int maxHeight, String destination, int capacity) {
		super(name, company, year, maxHeight);
		this.destination = destination;
		this.capacity = capacity;
	}
	
	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	
	/**
	 * Sets the destination.
	 *
	 * @param newDestination the new destination
	 */
	public void setDestination(String newDestination) {
		destination = newDestination;
	}
	
	/**
	 * Gets the capacity.
	 *
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/**
	 * Sets the capacity.
	 *
	 * @param newCapacity the new capacity
	 */
	public void setCapacity(int newCapacity) {
		if (newCapacity >= 0 && newCapacity <= 10) {
			capacity = newCapacity;
		}
	}
	
	/* (non-Javadoc)
	 * @see lrurunway.AirObject#toString()
	 */
	public String toString() {
		return "Rocket : [" + super.getName() + "] [" + super.getCompany() + "] [" + super.getYear() + "] [" + super.getMaxHeight() + "] [" + destination + "] ["
				+ capacity + "]";
	}
	
}
