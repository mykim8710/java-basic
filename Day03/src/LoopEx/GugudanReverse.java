// 구구단 9단부터 반대로 출력

package LoopEx;

public class GugudanReverse {
	public static void main(String[] args) {
		for (int i = 9; i >= 1; i--) {
			System.out.println("[" + i + "단]");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			
			System.out.println();	
		}

	}
}
