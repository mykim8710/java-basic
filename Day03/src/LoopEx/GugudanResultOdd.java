// ������� Ȧ���� �����ܸ� ���

package LoopEx;

public class GugudanResultOdd {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "��]");

			for (int j = 1; j < 10; j++) {
				if ((i * j) % 2 == 1) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
			}

			System.out.println();

		}

	}
}
