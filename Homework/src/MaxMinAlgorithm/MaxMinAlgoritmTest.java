package MaxMinAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

class MaxMinAlgoritm {

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

public class MaxMinAlgoritmTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) {
			number[i] = scanner.nextInt();
		}
		scanner.close();

		System.out.println("Min Value : " + MaxMinAlgoritm.myMin(number));
		System.out.println("Max Value : " + MaxMinAlgoritm.myMax(number));

		System.out.println("Min Value : " + MaxMinAlgoritm.myMin2(number));
		System.out.println("Max Value : " + MaxMinAlgoritm.myMax2(number));

	}
}
