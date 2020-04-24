package ScannerEx;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str1 = scanner.nextLine();

		System.out.println("문자열 입력");
		String str2 = scanner.nextLine();

		System.out.printf("입력된 문자열 : %s\n", str1);
		System.out.printf("입력된 문자열 : %s\n", str2);

	}

}
