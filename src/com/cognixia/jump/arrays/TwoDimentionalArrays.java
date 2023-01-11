package com.cognixia.jump.arrays;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		// 2D array from example slide
		char grid[][] = {
				{'A', 'B', 'C', 'D'},
				{'E', 'F', 'G', 'H'},
				{'I', 'J', 'K', 'L'}
		};
		
		
		System.out.println(grid.length);
		System.out.println(grid[1].length);
		// print array
		for(int row = 0; row < grid.length ; row++) {
			
			for(int col = 0; col < grid[row].length; col++) {
			
				System.out.print(grid[row][col] + " ");
			}
			// print new line to separate each row when printing to screen
			System.out.println();
			
		}
		
		// access specific value
		System.out.println("\ngrid[1][3] = " + grid[1][3]);
		
		System.out.println("\n-----------------\n");	
		
		// can also not set anything for an array and will print default values
		int grid2[][] = new int[3][5];
		
		for (int row = 0; row < grid2.length; row++) {

			for (int col = 0; col < grid2[row].length; col++) {

				System.out.print(grid2[row][col] + " ");
			}
			// print new line to separate each row when printing to screen
			System.out.println();
			

		}
		
		System.out.println("\n-----------------\n");
		// can also have varing column lengths while still setting row length
		int[][] grid3 = new int[4][];
		
		grid3[0] = new int[] { 1 };
		grid3[1] = new int[] { 1, 2 };
		grid3[2] = new int[] { 1, 2, 3 };
		grid3[3] = new int[] { 1, 2, 3, 4 };
		
		for (int row = 0; row < grid3.length; row++) {

			for (int col = 0; col < grid3[row].length; col++) { // because we are using the column length of each row we
																// don't get any errors while printing
				System.out.print(grid3[row][col] + " ");
			}
			// print new line to separate each row when printing to screen
			System.out.println();

		}
		
		
//		int[][] grid4 = new int[4][];
//		grid4[4] = new int[] { 1, 2, 3, 4, 5};
		

	}

}
