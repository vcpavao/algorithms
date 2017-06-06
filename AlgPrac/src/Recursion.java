
public class Recursion {
	/**
	 * 
	 * @param n - value of factorial to be computed
	 * @return factorial of n
	 */
	public int factorial(int n) {
		  if(n < 2) return 1;
		  return n * factorial(n-1);
		}
	
	/**
	 * @param n - number of fibonacci values to be computed
	 * @return fibonacci sequence of n values
	 */
	public int fibonacci(int n) {
		  if(n == 0) return 0;
		  if(n == 1 || n == 2) return 1;
		  return fibonacci(n-2) + fibonacci(n-1);
	}

	/**
	 * @param n - integer to have its digits counted
	 * @return the number of occurrences of 7 as a digit
	 */
	public int count7(int n) {
		  int count = 0;
		  if(n == 0) return 0;
		  if(n%10 == 7) count++;
		  return count + count7(n/10);
	}
	
	/**
	 * @param n - value whose digits will be added
	 * @return sum of n's digits
	 */
	public int sumDigits(int n) {
		  if(n == 0) return 0;
		  return n%10 + sumDigits(n/10);
	}

	/**
	 * @param str - given string to be cleaned
	 * @return string clean of repetitive characters
	 */
	public String stringClean(String str) {
		  if(str.length() == 0) return "";
		  if(str.length() == 1) return str;
		  if(str.charAt(0) == str.charAt(1)) {
		      if(str.length() > 2 && str.charAt(1) == str.charAt(2)) {
		      return str.charAt(0) + stringClean(str.substring(3));
		      }
		      return str.charAt(0) + stringClean(str.substring(2));
		  }
		  return str.charAt(0) + stringClean(str.substring(1));
	}
	
	/**
	 * @param str - given string to be searched for 'hi'
	 * @return number of lowercase 'hi' appearances in string
	 */
	public int countHi(String str) {
		  if (str.length() == 0) return 0;
		  int count = 0;
		  if(str.length() >=2 && str.charAt(0) == 'h' && str.charAt(1) == 'i') count++;
		  return count + countHi(str.substring(1));
	}
	
	/**
	 * @param nums - array of positive integers
	 * @param index - recursive index call, always starts at 0
	 * @return number of appearances of 11 in nums
	 */
	public int array11(int[] nums, int index) {
		  int tally = 0;
		  if(nums.length == index) {
		   return 0;
		  } 
		  if(nums[index] == 11) {
		       tally++;
		  }
		  return tally + array11(nums, index + 1);
	}
}
