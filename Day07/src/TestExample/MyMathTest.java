/*	������ Ŭ������ Ŭ���� �޼��带 ����ÿ�.
	Ŭ���� ��:  MyMath
	�޼���1: myMin(static)
	�Ķ����: int �迭
	���ϰ�  : �迭�� �� �� �ּҰ�

	�޼���2: myMax(static)
	�Ķ����: int �迭
	���ϰ� : �迭�� �� �� �ּҰ�

	�׽�Ʈ Ŭ���� MyMathTest�� ������ int �迭 5���� Ű���� �Է����� ������ myMin, myMax �Լ� ȣ���Ұ� */

package TestExample;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) {
			number[i] = scanner.nextInt();
		}
		scanner.close();

		System.out.println("Min Value : " + MyMath.myMin(number));
		System.out.println("Max Value : " + MyMath.myMax(number));

		System.out.println("Min Value : " + MyMath.myMin2(number));
		System.out.println("Max Value : " + MyMath.myMax2(number));

	}
}
