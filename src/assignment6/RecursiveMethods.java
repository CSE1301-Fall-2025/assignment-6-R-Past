package assignment6;

public class RecursiveMethods {

	/**
	 * Recursively computes base ^ exponent
	 * 
	 * @param base the base - can be positive or negative
	 * @param exp  the exponent - can be positive or negative
	 * @return base ^ exponent
	 */
	public static double exponent(int base, int exp) {
		
			//Base Case
			if (exp == 0){
				return 1;
			}

			//Case: Exponent is Negetive
			if (exp < 0){
				return 1.0/exponent(base, -exp);
			}

			//Case: Exponent is Positive
			return 1.0*base*exponent(base, exp - 1);
			
	}

	

	/**
	 * Recursively compute the sum of elements in an array
	 * 
	 * @param array an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] array) {
			return arraySumHelper(array, 0);		
	}

	public static int arraySumHelper(int[] array, int index){
		if (array.length == 0){
			return 0;
		}
		
		if (index == array.length-1){
			return array[index];
		}
		
		return array[index] + arraySumHelper(array, index+1);
	}

	/**
	 * Recursively computes string representations of dragon curves
	 * 
	 * @param n the desired degree of the dragon curve
	 * @return the nth dragon curve
	 */
	public static String dragon(int n) {
		
		return dragonHelper("F-H", n);
			
	}

	public static String dragonHelper(String str, int n) {
		//Base Case
		if (n == 0){
			return str;
		}

		return dragonHelper(str.replace("F", "A-B").replace("H", "A+B").replace("A", "F").replace("B", "H"), n-1);
	}

	

	/**
	 * Finds the length of the longest path in the given 2D array from the specified
	 * start position.
	 * 
	 * @param chart 2D array of stones
	 * @param r     start position row
	 * @param c     start position column
	 * @return the length of the longest path that was found
	 */
	public static int maxPathLength(boolean[][] chart, int r, int c) {
		
			// FIXME Find and return the length of the longest path in the array
			return 0;
			
	}
}
