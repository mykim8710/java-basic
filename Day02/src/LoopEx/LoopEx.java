package LoopEx;

public class LoopEx {
	public static void main(String[] args) {
		
		// 1~100���� ������ �� 1(for��)
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("for�� ��� -> 1~100���� ������ �� : " + sum1);

		
		// 1~100���� ������ �� 2(while��)
		int sum2 = 0;
		int i = 1;
		while (i <= 100) {
			sum2 = sum2 + i;
			i++;
		}
		System.out.println("while�� ��� -> 1~100���� ������ �� : " + sum2);

		
	}
}
