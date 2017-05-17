
public class UsefulAlgorithmsPrac {

	/**
	 * Recursive implementation of Euclid's Algorithm
	 * @param m given integer 1
	 * @param n given integer 2
	 * @return greatest common divisor
	 */
	public static int euclid_r(int m, int n) {
		if(n == 0) {
			return m;
		}
		else {
			return euclid_r(n, m%n);
		}
	}
	
	/**
	 * Iterative implementation of Euclid's Algorithm
	 * @param m given integer 1
	 * @param n given integer 2
	 * @return greatest common divisor
	 */
	public static int euclid_t(int m, int n) {
		//Good programming practice would be to declare m and n equal to
		//temporary variables within the class
		while(n != 0) {
			m = n;
			n = m%n;
		}
		return m;
	}
	
	/**
	 * Method for finding two real roots of a quadratic equation,
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
		// TODO Auto-generated method stub
		int f = euclid_r(60,24);
		int g = euclid_r(60,24);
		System.out.println(f);
		System.out.println(g);
		
		double [] h = roots(1.0, -4.0, 4.0);
		System.out.println(h[0]);
		System.out.println(h[1]);
	}

}
