package TestExample;

import java.util.Scanner;

interface IMaxMin {
	public abstract double max(double arr[]);
	public abstract double min(double arr[]);
}

class MaxMin implements IMaxMin {

	@Override
	public double max(double[] arr) {
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	@Override
	public double min(double[] arr) {
		double min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;
	}

}

public class MaxMinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[5];
		System.out.println("비교 할 5개의 실수를 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}

		IMaxMin imm = new MaxMin();
		System.out.println("Max Value : " + imm.max(arr));
		System.out.println("Min Value : " + imm.min(arr));
	}

}
