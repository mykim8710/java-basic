package LoopEx;

public class LoopEx2 {
	public static void main(String[] args) {

		// 1~100까지 정수 중 3의 배수를 출력(for문)
		System.out.println("for문 사용, 1~100 사이의 3의배수");
		System.out.print("> ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}
}