// 구구단 출력

package LoopEx;

public class Gugudan {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.println("[" +i + "단]");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j) );
			}

			System.out.println();
		}

	}
}
