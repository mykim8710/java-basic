package RandomEx;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

interface IRamdomNum {
	public abstract void correctNum();
}

class CorrectNum implements IRamdomNum {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int user;
	int count;
	int tryNumber;
	int randomNumber = r.nextInt(100) + 1;

	@Override
	public void correctNum() {
		System.out.println("1 ~ 100 ������ ���� ���߱� ����");
		System.out.println();
		System.out.println("���� : " + randomNumber);
		System.out.println();
		System.out.print("�õ� �� Ƚ���� �Է��ϼ��� >> ");

		while (true) {
			try {
				tryNumber = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("��ȿ���� ���� ���Դϴ�. Ƚ���� �ٽ� �Է��ϼ��� >> ");
				sc = new Scanner(System.in);
			}
		}

		do {
			count++;
			System.out.println();
			System.out.printf("1 ~ 100 ������ ������ �Է��ϼ��� >> ");

			try {
				user = sc.nextInt();

				if (user >= 1 && user <= 100) {
					if (user < randomNumber) {
						if (count < tryNumber) {
							System.out.printf("%d���� ū ���� �Է��ϼ���.\n", user);
						} else {
							break;
						}
					} else if (user > randomNumber) {
						if (count < tryNumber) {
							System.out.printf("%d���� ���� ���� �Է��ϼ���. \n", user);
						} else {
							break;
						}
					} else if (user == randomNumber) {
						System.out.println();
						System.out.println("   �������� : " + randomNumber + "  ==  ����� : " + user);
						System.out.println("�����Դϴ�. " + count + "�� ���� ���߼̽��ϴ�. ¦¦¦!!");
						System.out.println();
						break;
					}
				} else {
					System.out.println("�Է¹����� �ʰ��߽��ϴ�. 1 ~ 100 ������ ������ �Է��ϼ���.");
					count--;
				}
			} catch (InputMismatchException e) {
//				e.printStackTrace();
				System.out.println("��ȿ���� ���� ���Դϴ�.");
				System.out.println("�ٽ� �Է��ϼ���(1 ~ 100 ������ ����)");
				count--;
				sc = new Scanner(System.in);
			}

		} while (user != randomNumber && count < tryNumber);

		if (user != randomNumber) {
			System.out.println();
			System.out.println("���� �� �̤�");
			System.out.println(tryNumber + "���� ��ȸ�� �� �����ϼ̽��ϴ�.");
		}

	}
}

public class CorrectNumTest {
	public static void main(String[] args) {
		CorrectNum cn = new CorrectNum();
		cn.correctNum();
	}
}
