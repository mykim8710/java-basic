// 메서드 작성 예제
// 1. 파라미터를 하나 받아 원의 넚이를 구하는 메서드 작성
// 2. 가로 세로를 입력받아 삼각형의 넓이를 구하는 메서드 작성
// 3. 1부터 100까지 수의 홀수의 합을 구하는 메서드 작성
// 4. 파라미터 하나를 받아서 별찍는 메서드 작성
// 5. 파라미터 두개를 받아서 2,5 : 2~5단까지 구구단 출력(역순으로 입력받아도 순서는 유지)하는 메서드 작성

package MethodEx;

public class MethodTest {
	public static void main(String[] args) {

		double radius = 10;
		double circleArea = circleArea(radius);
		System.out.println("원의 넓이는 : " + circleArea);
		System.out.println();

		double height = 5;
		double width = 15;
		double triangleArea = triangleArea(height, width);
		System.out.println("삼각형의 넓이는 : " + triangleArea);
		System.out.println();

		int sum = sumOdd();
		System.out.println("1~100까지 수중 홀수의 합은 : " + sum);
		System.out.println();

		int n = 10;
		starPrint(n);
		System.out.println();

		int inputA = 2;
		int inputB = 5;
		gugudanPrint(inputA, inputB);			// if~else
		gugudanPrint2(inputA, inputB);		// swap algorithm
	}

	// 1. 원의 넓이를 구하는 메서드
	public static double circleArea(double radius) {
		final double PI = 3.141592;
		return radius * radius * PI;
	}

	// 2. 삼각형의 넓이를 구하는 메서드
	public static double triangleArea(double height, double width) {
		return (height * width) / 2.0;
	}

	// 3. 1부터 100까지 수의 홀수의 합을 구하는 메서드
	public static int sumOdd() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		return sum;
	}

	// 4. 파라미터 하나를 받아서 파라미터 만큼 별찍는 메서드
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

	// 5. 파라미터 두개를 받아서 ex) 2,5 : 2~5단까지 구구단 출력(역순으로 입력받아도 순서는 유지)하는 메서드
	public static void gugudanPrint(int inputA, int inputB) {
		if (inputA > inputB) {
			for (int i = inputB; i <= inputA; i++) {
				System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
				System.out.println();
			}
		} else {
			for (int i = inputA; i <= inputB; i++) {
				System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
				System.out.println();
			}
		}
	}

	public static void gugudanPrint2(int inputA, int inputB) {

		//swap 알고리즘
		int temp;
		if (inputA > inputB) {
			temp = inputA;
			inputA = inputB;
			inputB = temp;
		}

		for (int i = inputA; i <= inputB; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
