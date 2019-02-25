package polymorphism;

public class ExternalContractor extends Employee {
	
	public ExternalContractor(String name, double hourlyRate) {
		super(name, hourlyRate);
	}
	
	public double getHourlyRate(int custRank) {
		switch(custRank) {
		case 1:
			return 38.50;
		case 2:
			return 41.75;
		case 3:
			return 45.50;
		default:
			return 45.50;
		}
	}
	
	public double weeklyPay(int hours, int custRank) {
		return hours * getHourlyRate(custRank);
	}
}
