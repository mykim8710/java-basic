package SwitchEx;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			System.out.println("Simple JAVA");
			break;
		case 2:
			System.out.println("Funny JAVA");
			break;
		case 3:
			System.out.println("Fantastic JAVA");
			break;
		default:
			System.out.println("The best programming language");
		}

		System.out.println("Do you like JAVA?");
	}
}
