import java.util.Random;

public class BruteForcePrac {
	/**
	 * Brute force method for finding the integer square root of a value
	 * @param n - given value
	 * @return value's integer square root
	 */
	public static int square_root(int n) {
		int i;
		//The square root will never equal more than half of the given number
		for(i = 0; i < n/2; i++) {
			//First i * i value greater than n reached
			if(i * i > n) {
				return i - 1;
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @param key - number being searched
	 * @param values - array of numbers
	 * @return location of key if key is found, if not -1 is returned
	 */
	public static int exhaustive_search(int key, int [] values) {
		for(int k = 0; k < values.length; k++) {
			if(values[k] == key) {
				return k;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//Square root testing requires one positive value
		int num = 64;
		System.out.println("The square root of " + num +
				" is: " + square_root(num));
		//Exhaustive search testing populates array with
		//random numbers from 1 to 100
		int size = 50;
		int [] values = new int[size];
		Random r = new Random();
		for(int i = 0; i < size; i++) {
			values[i] = (r.nextInt(99) + 1);
		}
		int search_key = 20;
		System.out.println("Location of " + search_key +
				" in array: " + exhaustive_search(search_key, values));
	}
}
