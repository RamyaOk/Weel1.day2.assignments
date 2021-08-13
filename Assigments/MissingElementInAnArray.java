package wee1.day2.Assigments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 9, 8 };



		// Sort the array

		Arrays.sort(arr);



		// loop through the array (start i from arr[0] till the length of the array)

		for (int i = 0; i < arr.length; i++) {



			int j = i + 1;

			// check if the iterator variable is not equal to the array values respectively

			if (arr[i] != j) {

				// print the number

				System.out.println("Missing element in the array is "+j);

				// once printed break the iteration

				break;

			}



		}

	}

}
