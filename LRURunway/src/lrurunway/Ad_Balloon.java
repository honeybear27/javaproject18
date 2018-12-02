package lrurunway;

public class Ad_Balloon extends AirObject{
	private String ad_company;
	private int radius;
	private int capacity;
	
	public Ad_Balloon(String name, String company, int year, int maxHeight, String ad_company, int radius, int capacity) {
		super(name, company, year, maxHeight);
		this.ad_company = ad_company;
		this.radius = radius;
		this.capacity = capacity;
	}
	
	public String getAd_company() {
		return ad_company;
	}
	
	public void setAd_company(String newAd_company) {
		ad_company = newAd_company;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int newRadius) {
		if (newRadius > 0 && newRadius < 100) {
			radius = newRadius;
		}
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int newCapacity) {
		if (newCapacity > 0 && newCapacity < 30) {
			capacity = newCapacity;
		}
	}
	
	public String toString() {
		return "Ad_Balloon : [" + super.getName() + "] [" + super.getCompany() + "] [" + super.getYear() + "] [" + super.getMaxHeight() + "] [" + ad_company + "] ["
				+ radius + "] [" + capacity + "]";
	}
}
