
public class BruteForcePrac {
	/**
	 * Brute force method for finding the integer square root of a value
	 * @param n given value
	 * @return value's integer square root
	 */
	public static int square_root(int n) {
		int i;
		for(i = 0; i * i < n; i++) {
		}
		return i;
	}
	
	/**
	 * Brute force method for finding two real roots of a quadratic equation,
	 * assumes "smart user" who will input reasonable integer values
	 * @param a coefficient of x^2 term
	 * @param b coefficient of x term
	 * @param c integer
	 * @return array containing the two real roots given three coefficients
	 */
	public static double [] roots(double a, double b, double c) {
		double bs = b * b;
		double sub = 4 * a * c;
		double [] roots = {(-b + (Math.sqrt(bs - sub)))/(2*a), (-b - (Math.sqrt(bs - sub)))/(2*a)};
		return roots;
	}
	
	public static void main(String[] args) {
		double [] h = roots(1.0, -4.0, 4.0);
		System.out.println(h[0]);
		System.out.println(h[1]);
	}
}
