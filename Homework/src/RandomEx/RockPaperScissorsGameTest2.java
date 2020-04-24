package RandomEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RockPaperScissorsGameTest2 {

	public static void getResult(int user, int com) {
		switch (user - com) {
		case 0:
			System.out.println("��� : �����ϴ� ~~");
			break;
		case -1:
		case 2:
			System.out.println("��� : �����ϴ� �Ф�");
			break;
		case 1:
		case -2:
			System.out.println("��� : �̰���ϴ� ^^");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userSelect;
		int comSelecet = (int) (Math.random() * 3) + 1;
		String[] rps = { "����", "����", "��" };

		System.out.println("����   ����   ��   ����");
		System.out.print("����(1), ����(2), ��(3) >> ");
		
		while (true) {
			try {
				userSelect = sc.nextInt();
				if (userSelect >= 1 && userSelect <= 3) {
					break;
				} else {
					System.out.print("�Է¹����� �ʰ� : 1, 2, 3 �� �� �Է� >> ");
				}

			} catch (InputMismatchException e) {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ��� >> ");
				sc = new Scanner(System.in);
			}
		}

		System.out.println();
		System.out.println("����� : " + rps[userSelect - 1]);
		System.out.println("��ǻ�� : " + rps[comSelecet - 1]);
		System.out.println();
		getResult(userSelect, comSelecet);
	}

}
