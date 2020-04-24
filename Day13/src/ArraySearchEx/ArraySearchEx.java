package ArraySearchEx;

import java.util.Arrays;

public class ArraySearchEx {
	public static void main(String[] args) {
		int[] arr = { 33, 55, 11, 44, 22 };

		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Index of 33 : " + Arrays.binarySearch(arr, 33));

	}
}
