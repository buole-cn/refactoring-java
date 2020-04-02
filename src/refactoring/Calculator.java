package refactoring;

public class Calculator {
	public String calcQuadraticEq(double a, double b, double c) {
		double D = b * b - 4 * a * c;
		if (D > 0) {
			return dGreaterThanZero(a, b, D);
		} else if (D == 0) {
			return dEqualsZero(a, b);
		} else {
			return dLessThanZero();
		}
	}
	
	public double sum(double... ds) {
		double result = 0;
		for (double d : ds) {
			result += d;
		}
		return result;
    }
    
	private String dGreaterThanZero(double a, double b, double D) {
		double x1, x2;
		x1 = (-b - Math.sqrt(D)) / (2 * a);
		x2 = (-b + Math.sqrt(D)) / (2 * a);
		return "x1 = " + x1 + ", x2 = " + x2;
	}

	private String dEqualsZero(double a, double b) {
		double x;
		x = -b / (2 * a);
		return "x = " + x;
	}
	
	private String dLessThanZero() {
		return "Equation has no roots";
	}
}
