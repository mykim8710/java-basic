package LoopEx;

public class LoopEx2 {
	public static void main(String[] args) {

		// 1~100���� ���� �� 3�� ����� ���(for��)
		System.out.println("for�� ���, 1~100 ������ 3�ǹ��");
		System.out.print("> ");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}
}