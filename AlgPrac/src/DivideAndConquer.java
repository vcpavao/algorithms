import java.util.Random;

public class DivideAndConquer {
	
	/**
	 * Recursively performs dividing operation in mergeSort
	 * @param ints 
	 */
	public static void mergeSort(int [] ints) {
	
	}
	
	public static void main(String [] args) {
		int [] values = new int[50];
		Random r = new Random();
		//Populates array with random numbers with values spanning 1 to 100
		for(int i = 0; i < 100; i++) {
			values[i] = (r.nextInt(99) + 1);
		}
		mergeSort(values);
	}
}
