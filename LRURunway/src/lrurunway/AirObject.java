package lrurunway;

/**
 * The Class AirObject.
 */
public class AirObject implements Comparable<AirObject> {
	
	/** The name. */
	private String name;
	
	/** The company. */
	private String company;
	
	/** The year. */
	private int year;
	
	/** The max height. */
	private int maxHeight;

	/**
	 * Instantiates a new air object.
	 *
	 * @param name the name
	 * @param company the company
	 * @param year the year
	 * @param maxHeight the max height
	 */
	public AirObject(String name, String company, int year, int maxHeight) {
		this.name = name;
		this.company = company;
		this.year = year;
		this.maxHeight = maxHeight;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param newName the new name
	 */
	public void setName(String newName) {
		if (!newName.equals("")) {
			name = newName;
		}
	}
 
	/**
	 * Gets the company.
	 *
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * Sets the company.
	 *
	 * @param newCompany the new company
	 */
	public void setCompany(String newCompany) {
		if (!newCompany.equals("")) {
			company = newCompany;
		}
	}

	/**
	 * Gets the year.
	 *
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year.
	 *
	 * @param newYear the new year
	 */
	public void setYear(int newYear) {
		if (newYear >= 0 && newYear <= 2018) {
			year = newYear;
		}
	}

	/**
	 * Gets the max height.
	 *
	 * @return the max height
	 */
	public int getMaxHeight() {
		return maxHeight;
	}

	/**
	 * Sets the max height.
	 *
	 * @param newMaxHeight the new max height
	 */
	public void setMaxHeight(int newMaxHeight) {
		if (newMaxHeight > 0) {
			maxHeight = newMaxHeight;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "AirObject : [" + name + "] [" + company + "] [" + year + "] [" + maxHeight + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(AirObject arg) {
		if (name.compareTo(arg.getName()) < 0) {
			return -1;
		} else if (name.compareTo(arg.getName()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
