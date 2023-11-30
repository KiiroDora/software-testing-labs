package lab3;

public class DivideCalculator {
	public double divide(double num, double denom) {
		if (denom == 0) {	
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		
		return num / denom;
	}
}
