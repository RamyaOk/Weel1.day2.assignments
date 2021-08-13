package wee1.day2.Assigments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,25,87};

		Arrays.sort(data);

		int l=data.length;

		System.out.println(data[l-2]);
	}

}
