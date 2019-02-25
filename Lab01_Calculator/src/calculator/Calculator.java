package calculator;

public class Calculator {
	
	private double input1;
	private double input2;
	
	public Calculator(double input1, double input2) {
		this.input1 = input1;
		this.input2 = input2;
	}
	
	public double getFirstInput() {
		return input1;
	}
	
	public double getSecondInput() {
		return input2;
	}
	
	public double multiply() {
		return input1 * input2;
	}
	
	public double divide() {
		if (Double.compare(input2, 0) != 0) {
			return input1 / input2;			
		}
		return Double.NaN;
	}
	
	
	public double add() {
		return input1 + input2;
	}
	
	public double subtract() {
		return input1 - input2;
	}
	
	public double power() {
			return Math.pow(input1, input2);			
	}
	
	
}
