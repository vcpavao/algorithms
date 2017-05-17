
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = euclid_r(60,24);
		int g = euclid_r(60,24);
		System.out.println(f);
		System.out.println(g);
	}

}
