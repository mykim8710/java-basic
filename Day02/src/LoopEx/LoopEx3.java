package LoopEx;

public class LoopEx3 {
	public static void main(String[] args) {

		// 1~100���� ���� �� Ȧ���� ��, ¦���� ��, ������ ���
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) { 			// Ȧ������
				sum1 = sum1 + i;
			} else if (i % 2 == 0) { 	// ¦������
				sum2 = sum2 + i;
			}

		}

		System.out.println("1~100 ���� ���� �� Ȧ���� ���� : " + sum1);
		System.out.println("1~100 ���� ���� �� ¦���� ���� : " + sum2);
		System.out.println("1~100 ���� ������ ������ : " + (sum1 + sum2));

	}
}
