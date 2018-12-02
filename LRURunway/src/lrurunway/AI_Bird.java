package lrurunway;

public class AI_Bird extends AirObject{
	private String type;
	private String purpose;
	
	public AI_Bird(String name, String company, int year, int maxHeight, String type, String purpose) {
		super(name, company, year, maxHeight);
		this.type = type;
		this.purpose = purpose;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String newType) {
		type = newType; 
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String newPurpose) {
		purpose = newPurpose;
	}
	
	public String toString() {
		return "AI_Bird : [" + super.getName() + "] [" + super.getCompany() + "] [" + super.getYear() + "] [" + super.getMaxHeight() + "] [" + type + "] ["
				+ purpose + "]";
	}
	
}
