package ExceptionEX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("a/b......input a >> ");
			int a = sc.nextInt();
			System.out.print("a/b......input b? >> ");
			int b = sc.nextInt();

			System.out.println("a / b = " + a / b);
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InputMismatchException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Good Bye~!!");

	}
}
