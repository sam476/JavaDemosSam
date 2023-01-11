package  com.cognixia.jump.arrays;

import java.util.Arrays;

public class MatchArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 0 };
		int[] arr2 = { 0, 5, 1, 3 };
		int[] arr3 = { 3, 5, 4, 0 };
		int[] arr4 = { 1, 3, 5 };
		
		System.out.println("arr1 matches arr2: " + match(arr1, arr2));
		System.out.println("arr1 matches arr3: " + match(arr1, arr3));
		System.out.println("arr1 matches arr4: " + match(arr1, arr4));

	}
	
	public static boolean match(int[] arr1, int[] arr2) {
		if(arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				return true;
			}
			else {
				return false;
			}
		}
		// check if lengths not same, save time not doing extra work
		
		// sort both arrays, will be difficult to compare if not in same order
		
		// returns false if digits don't match
		
		// if everything matches, will reach this line and return true
		return false;
	}

}
