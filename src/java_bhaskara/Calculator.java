package java_bhaskara;

public class Calculator {

	private double x1;
	private double x2;

	private static double getDelta(int a, int b, int c) {
		Double delta = 0.0;
	
		delta = (Math.pow(b, 2)) - 4 * (a) * (c);

		return delta;
	}

	private static double getX1(int a, int b, int c) {
		Double x1 = 0.0;

		x1 = (((b) * -1) + Math.sqrt(getDelta(a, b, c))) / (2 * a);

		return x1;
	}

	private static double getX2(int a, int b, int c) {
		Double x2 = 0.0;

		x2 = (((b) * -1) - Math.sqrt(getDelta(a, b, c))) / (2 * a);

		return x2;
	}

	public static String bhaskara(int a, int b, int c) {

		double delta = getDelta(a, b, c);

		double x1 = getX1(a, b, c);
		double x2 = getX2(a, b, c);

		Object[] args;
		if (Double.isNaN(x1) || Double.isNaN(x2)) {
			args = new Object[] { a, b, c, "There are no real roots.", "There are no real roots.", delta };
			
		} else {
			args = new Object[] { a, b, c, x1, x2, delta };
			
		}

		String format = "%sx^2 + %sx + %s = 0\n[x'= %s] [x''= %s] [delta = %s]";

		return (String.format(format, args));
	}
}
