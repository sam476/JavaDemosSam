package com.cognixia.jump.arrays;

public class MissingValue {

	public static void main(String[] args) {
	   int[] array = {0, 1, 2, 3, 5};
	   int y = 1;
	   int ans = 0;
        
	   for(int i = 0; i < array.length; i++) {
		   if(array[i] + 1 != array[y]) {
			   ans = array[i] + 1;
			   System.out.println("Missing number is : " + ans);
		   } 
		   y++;
		   if(y >= array.length) {
			   break;
		   }
	   }
	}

}
