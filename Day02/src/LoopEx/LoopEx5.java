package LoopEx;

public class LoopEx5 {
	public static void main(String[] args) {
		// 1~100���� ���� �� 5�� ������� 7�� ����� ����϶�
		int num = 1;
//		boolean result = false;

		while (num < 100) {
			if ((num % 5 == 0) && (num % 7 == 0)) {
//				result = true;
//				break;
				System.out.println(num + " ��  5�� ������� 7�� ����̴�.");
			}
			num++;
		}

//		if (result == true) {
//			System.out.println(num + " ��  5�� ������� 7�� ����̴�.");
//		} else {
//			System.out.println("5�� ������� 7�� ����� ã�� ���߽��ϴ�.");
//		}

	}
}
