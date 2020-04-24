package TestExample;

import java.util.Arrays;

public class MyMath {

	public static int myMin(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;
	}

	public static int myMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;

	}

	public static int myMin2(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	public static int myMax2(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

}
