package LoopEx;

public class LoopEx {
	public static void main(String[] args) {
		
		// 1~100까지 정수의 합 1(for문)
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("for문 사용 -> 1~100까지 정수의 합 : " + sum1);

		
		// 1~100까지 정수의 합 2(while문)
		int sum2 = 0;
		int i = 1;
		while (i <= 100) {
			sum2 = sum2 + i;
			i++;
		}
		System.out.println("while문 사용 -> 1~100까지 정수의 합 : " + sum2);

		
	}
}
