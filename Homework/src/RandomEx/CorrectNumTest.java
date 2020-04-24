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
		System.out.println("1 ~ 100 사이의 숫자 맞추기 게임");
		System.out.println();
		System.out.println("정답 : " + randomNumber);
		System.out.println();
		System.out.print("시도 할 횟수를 입력하세요 >> ");

		while (true) {
			try {
				tryNumber = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("유효하지 않은 값입니다. 횟수를 다시 입력하세요 >> ");
				sc = new Scanner(System.in);
			}
		}

		do {
			count++;
			System.out.println();
			System.out.printf("1 ~ 100 사이의 정수를 입력하세요 >> ");

			try {
				user = sc.nextInt();

				if (user >= 1 && user <= 100) {
					if (user < randomNumber) {
						if (count < tryNumber) {
							System.out.printf("%d보다 큰 수를 입력하세요.\n", user);
						} else {
							break;
						}
					} else if (user > randomNumber) {
						if (count < tryNumber) {
							System.out.printf("%d보다 작은 수를 입력하세요. \n", user);
						} else {
							break;
						}
					} else if (user == randomNumber) {
						System.out.println();
						System.out.println("   랜덤숫자 : " + randomNumber + "  ==  사용자 : " + user);
						System.out.println("정답입니다. " + count + "번 만에 맞추셨습니다. 짝짝짝!!");
						System.out.println();
						break;
					}
				} else {
					System.out.println("입력범위를 초과했습니다. 1 ~ 100 사이의 정수만 입력하세요.");
					count--;
				}
			} catch (InputMismatchException e) {
//				e.printStackTrace();
				System.out.println("유효하지 않은 값입니다.");
				System.out.println("다시 입력하세요(1 ~ 100 사이의 정수)");
				count--;
				sc = new Scanner(System.in);
			}

		} while (user != randomNumber && count < tryNumber);

		if (user != randomNumber) {
			System.out.println();
			System.out.println("게임 끝 ㅜㅜ");
			System.out.println(tryNumber + "번의 기회를 다 소진하셨습니다.");
		}

	}
}

public class CorrectNumTest {
	public static void main(String[] args) {
		CorrectNum cn = new CorrectNum();
		cn.correctNum();
	}
}
