package ConstantEx;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.141592;
		System.out.println("�������� �Է��ϼ���.");
		double radius = scanner.nextDouble();

		System.out.println(PI * radius * radius);
	}
}
