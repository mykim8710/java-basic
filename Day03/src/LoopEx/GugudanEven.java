// 구구단 짝수단 출력

package LoopEx;

public class GugudanEven {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i += 2) {
			System.out.println("[" + i + "단]");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}

			System.out.println();

		}

	}
}
