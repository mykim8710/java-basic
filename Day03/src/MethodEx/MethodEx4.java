package MethodEx;

public class MethodEx4 {

	public static void divide(int a, int b) {
		if (b == 0) {
			System.out.println("0���� ������ �����ϴ�.");
			return;
		}
		System.out.println("a / b = " + (a / b));
	}

	public static void main(String[] args) {
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
	}
}
