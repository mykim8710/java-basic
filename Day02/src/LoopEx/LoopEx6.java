package LoopEx;

public class LoopEx6 {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;

		while ((num++) < 100) {
			if ((num % 5 != 0) || (num % 7 != 0)) {
				continue;
			}
			count++;
			System.out.println("5�� 7�� ��� : " +num);
		}
		System.out.println("���� : " +count);
	}
}
