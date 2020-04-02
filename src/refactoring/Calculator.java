package refactoring;

public class Calculator {
	public void calcQuadraticEq(double a, double b, double c) {
		double D = b * b - 4 * a * c;
		if (D > 0) {
			double x1, x2;
			x1 = (-b - Math.sqrt(D)) / (2 * a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		} else if (D == 0) {
			double x;
			x = -b / (2 * a);
			System.out.println("x = " + x);
		} else {
			System.out.println("Equation has no roots");
		}
	}
}
