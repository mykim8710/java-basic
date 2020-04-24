package RandomEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RockPaperScissorsGameTest2 {

	public static void getResult(int user, int com) {
		switch (user - com) {
		case 0:
			System.out.println("결과 : 비겼습니다 ~~");
			break;
		case -1:
		case 2:
			System.out.println("결과 : 졌습니다 ㅠㅠ");
			break;
		case 1:
		case -2:
			System.out.println("결과 : 이겼습니다 ^^");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userSelect;
		int comSelecet = (int) (Math.random() * 3) + 1;
		String[] rps = { "가위", "바위", "보" };

		System.out.println("가위   바위   보   게임");
		System.out.print("가위(1), 바위(2), 보(3) >> ");
		
		while (true) {
			try {
				userSelect = sc.nextInt();
				if (userSelect >= 1 && userSelect <= 3) {
					break;
				} else {
					System.out.print("입력범위를 초과 : 1, 2, 3 중 에 입력 >> ");
				}

			} catch (InputMismatchException e) {
				System.out.print("잘못 입력하셨습니다. 다시 입력해주세요 >> ");
				sc = new Scanner(System.in);
			}
		}

		System.out.println();
		System.out.println("사용자 : " + rps[userSelect - 1]);
		System.out.println("컴퓨터 : " + rps[comSelecet - 1]);
		System.out.println();
		getResult(userSelect, comSelecet);
	}

}
