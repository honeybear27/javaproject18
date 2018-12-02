package lrurunway;
/**
 * The Class Drone.
 */
public class Drone extends AirObject {
	
	/** The num wings. */
	private int numWings;
	
	/** The max range. */
	private int maxRange;

	/**
	 * Instantiates a new drone.
	 *
	 * @param name the name
	 * @param company the company
	 * @param year the year
	 * @param maxHeight the max height
	 * @param numWings the num wings
	 * @param maxRange the max range
	 */
	public Drone(String name, String company, int year, int maxHeight, int numWings, int maxRange) {
		super(name, company, year, maxHeight);
		this.numWings = numWings;
		this.maxRange = maxRange;

	}

	/**
	 * Gets the num wings.
	 *
	 * @return the num wings
	 */
	public int getNumWings() {
		return numWings;
	}

	/**
	 * Sets the num wings.
	 *
	 * @param newNumWings the new num wings
	 */
	public void setNumWings(int newNumWings) {
		if (newNumWings > 0 && newNumWings < 10) {
			numWings = newNumWings;
		}
	}

	/**
	 * Gets the max range.
	 *
	 * @return the max range
	 */
	public int getMaxRange() {
		return maxRange;
	}

	/**
	 * Sets the max range.
	 *
	 * @param newMaxRange the new max range
	 */
	public void setMaxRange(int newMaxRange) {
		if (newMaxRange > 0) {
			maxRange = newMaxRange;
		}
	}

	/* (non-Javadoc)
	 * @see lrurunway.AirObject#toString()
	 */
	public String toString() {
		return "Drone : [" + super.getName() + "] [" + super.getCompany() + "] [" + super.getYear() + "] [" + super.getMaxHeight() + "] [" + numWings + "] ["
				+ maxRange + "]";
	}
	
}
