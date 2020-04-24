// �޼��� �ۼ� ����
// 1. �Ķ���͸� �ϳ� �޾� ���� ���̸� ���ϴ� �޼��� �ۼ�
// 2. ���� ���θ� �Է¹޾� �ﰢ���� ���̸� ���ϴ� �޼��� �ۼ�
// 3. 1���� 100���� ���� Ȧ���� ���� ���ϴ� �޼��� �ۼ�
// 4. �Ķ���� �ϳ��� �޾Ƽ� ����� �޼��� �ۼ�
// 5. �Ķ���� �ΰ��� �޾Ƽ� 2,5 : 2~5�ܱ��� ������ ���(�������� �Է¹޾Ƶ� ������ ����)�ϴ� �޼��� �ۼ�

package MethodEx;

public class MethodTest {
	public static void main(String[] args) {

		double radius = 10;
		double circleArea = circleArea(radius);
		System.out.println("���� ���̴� : " + circleArea);
		System.out.println();

		double height = 5;
		double width = 15;
		double triangleArea = triangleArea(height, width);
		System.out.println("�ﰢ���� ���̴� : " + triangleArea);
		System.out.println();

		int sum = sumOdd();
		System.out.println("1~100���� ���� Ȧ���� ���� : " + sum);
		System.out.println();

		int n = 10;
		starPrint(n);
		System.out.println();

		int inputA = 2;
		int inputB = 5;
		gugudanPrint(inputA, inputB);			// if~else
		gugudanPrint2(inputA, inputB);		// swap algorithm
	}

	// 1. ���� ���̸� ���ϴ� �޼���
	public static double circleArea(double radius) {
		final double PI = 3.141592;
		return radius * radius * PI;
	}

	// 2. �ﰢ���� ���̸� ���ϴ� �޼���
	public static double triangleArea(double height, double width) {
		return (height * width) / 2.0;
	}

	// 3. 1���� 100���� ���� Ȧ���� ���� ���ϴ� �޼���
	public static int sumOdd() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		return sum;
	}

	// 4. �Ķ���� �ϳ��� �޾Ƽ� �Ķ���� ��ŭ ����� �޼���
	public static void starPrint(int n) {
		char star = '+';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(star);
			}
			System.out.println();
		}

	}

	// 5. �Ķ���� �ΰ��� �޾Ƽ� ex) 2,5 : 2~5�ܱ��� ������ ���(�������� �Է¹޾Ƶ� ������ ����)�ϴ� �޼���
	public static void gugudanPrint(int inputA, int inputB) {
		if (inputA > inputB) {
			for (int i = inputB; i <= inputA; i++) {
				System.out.println(i + "��");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
				System.out.println();
			}
		} else {
			for (int i = inputA; i <= inputB; i++) {
				System.out.println(i + "��");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
				System.out.println();
			}
		}
	}

	public static void gugudanPrint2(int inputA, int inputB) {

		//swap �˰���
		int temp;
		if (inputA > inputB) {
			temp = inputA;
			inputA = inputB;
			inputB = temp;
		}

		for (int i = inputA; i <= inputB; i++) {
			System.out.println(i + "��");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
