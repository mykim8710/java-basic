package ScannerEx;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum);

	}

}
