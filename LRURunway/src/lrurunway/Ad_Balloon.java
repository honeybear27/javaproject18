package lrurunway;

// TODO: Auto-generated Javadoc
/**
 * The Class Ad_Balloon.
 */
public class Ad_Balloon extends AirObject{
	
	/** The ad company. */
	private String ad_company;
	
	/** The radius. */
	private int radius;
	
	/** The capacity. */
	private int capacity;
	
	/**
	 * Instantiates a new ad balloon.
	 *
	 * @param name the name
	 * @param company the company
	 * @param year the year
	 * @param maxHeight the max height
	 * @param ad_company the ad company
	 * @param radius the radius
	 * @param capacity the capacity
	 */
	public Ad_Balloon(String name, String company, int year, int maxHeight, String ad_company, int radius, int capacity) {
		super(name, company, year, maxHeight);
		this.ad_company = ad_company;
		this.radius = radius;
		this.capacity = capacity;
	}
	
	/**
	 * Gets the ad company.
	 *
	 * @return the ad company
	 */
	public String getAd_company() {
		return ad_company;
	}
	
	/**
	 * Sets the ad company.
	 *
	 * @param newAd_company the new ad company
	 */
	public void setAd_company(String newAd_company) {
		ad_company = newAd_company;
	}
	
	/**
	 * Gets the radius.
	 *
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius.
	 *
	 * @param newRadius the new radius
	 */
	public void setRadius(int newRadius) {
		if (newRadius > 0 && newRadius < 100) {
			radius = newRadius;
		}
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
		if (newCapacity > 0 && newCapacity < 30) {
			capacity = newCapacity;
		}
	}
	
	/* (non-Javadoc)
	 * @see lrurunway.AirObject#toString()
	 */
	public String toString() {
		return "Ad_Balloon : [" + super.getName() + "] [" + super.getCompany() + "] [" + super.getYear() + "] [" + super.getMaxHeight() + "] [" + ad_company + "] ["
				+ radius + "] [" + capacity + "]";
	}
}
