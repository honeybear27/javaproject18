package polymorphism;

import polymorphism.Employee;

public class Employee {
	private String name;
	protected double hourlyRate;
	
	public Employee(String name, double hourlyRate) {
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public double weeklyPay() {
		return hourlyRate;
	}
	
	public boolean equals(Employee emp) {
		return name.equals(emp.name);
	}
	
}
