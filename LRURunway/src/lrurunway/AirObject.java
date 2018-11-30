package lrurunway;

public class AirObject {
	private String name;
	private String company;
	
	public AirObject (String name, String company) {
		this.name = name;
		this.company = company;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		if (!newName.equals("")) {
			name = newName;
		}
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String newCompany) {
		if (!newCompany.equals("")) {
			company = newCompany;
		}
	}
	
	public String toString() {
		return "AirObject : [" + name + "] [" + company + "]";
	}

}
