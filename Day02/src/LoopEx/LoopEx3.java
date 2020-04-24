package LoopEx;

public class LoopEx3 {
	public static void main(String[] args) {

		// 1~100까지 정수 중 홀수의 합, 짝수의 합, 총합을 출력
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) { 			// 홀수조건
				sum1 = sum1 + i;
			} else if (i % 2 == 0) { 	// 짝수조건
				sum2 = sum2 + i;
			}

		}

		System.out.println("1~100 사이 정수 중 홀수의 합은 : " + sum1);
		System.out.println("1~100 사이 정수 중 짝수의 합은 : " + sum2);
		System.out.println("1~100 사이 정수의 총합은 : " + (sum1 + sum2));

	}
}
