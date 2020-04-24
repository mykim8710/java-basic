package MethodEx;

public class MrthodEx3 {
	public static void main(String[] args) {
		int result;
		result = add(4, 5);
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5  x 3.5 = " + square(3.5));
	}

	private static double square(double a) {
		return a * a;
	}

	private static int add(int a, int b) {
		int addresult = a + b;
		return addresult;
	}
}
