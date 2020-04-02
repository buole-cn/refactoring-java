package refactoring;

public class Calculator {
	public String calcQuadraticEq(double a, double b, double c) {
		double D = b * b - 4 * a * c;
		if (D > 0) {
			double x1, x2;
			x1 = (-b - Math.sqrt(D)) / (2 * a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);
			return "x1 = " + x1 + ", x2 = " + x2;
		} else if (D == 0) {
			double x;
			x = -b / (2 * a);
			return "x = " + x;
		} else {
			return "Equation has no roots";
		}
	}
	
	public double sum(double... ds) {
		double result = 0;
		for (double d : ds) {
			result += d;
		}
		return result;
	}
}
