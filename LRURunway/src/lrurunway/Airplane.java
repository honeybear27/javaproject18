package lrurunway;

// TODO: Auto-generated Javadoc
/**
 * The Class Airplane.
 */
public class Airplane extends AirObject{
	
	/** The destination. */
	private String destination;
	
	/** The capacity. */
	private int capacity;
	
	/** The pilot. */
	private String pilot;
	
	/**
	 * Instantiates a new airplane.
	 *
	 * @param name the name
	 * @param company the company
	 * @param year the year
	 * @param maxHeight the max height
	 * @param destination the destination
	 * @param capacity the capacity
	 * @param pilot the pilot
	 */
	public Airplane(String name, String company, int year, int maxHeight, String destination, int capacity, String pilot) {
		super(name, company, year, maxHeight);
		this.destination = destination;
		this.capacity = capacity;
		this.pilot = pilot;
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
		if (newCapacity > 0 && newCapacity < 100) {
			capacity = newCapacity;
		}
	}
	
	/**
	 * Gets the pilot.
	 *
	 * @return the pilot
	 */
	public String getPilot() {
		return pilot;
	}
	
	/**
	 * Sets the pilot.
	 *
	 * @param newPilot the new pilot
	 */
	public void setPilot(String newPilot) {
		pilot = newPilot;
	}
	
	/* (non-Javadoc)
	 * @see lrurunway.AirObject#toString()
	 */
	public String toString() {
		return "Airplane : [" + super.getName() + "] [" + super.getCompany() + "] [" + super.getYear() + "] [" + super.getMaxHeight() + "] [" + destination + "] ["
				+ capacity + "] [" + pilot + "]";
	}
}
