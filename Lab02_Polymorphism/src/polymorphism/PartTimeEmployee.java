package polymorphism;

public class PartTimeEmployee extends Employee {
	private int hours;
	
	public PartTimeEmployee(String name, double hourlyRate, int hours) {
		super(name, hourlyRate);
		this.hours = hours;
	}
	
	public int getHoursWorked() {
		return hours;
	}
	
	public double weeklyPay() {
		return hourlyRate * hours;
	}
	
}
