package LoopEx;

public class LoopEx5 {
	public static void main(String[] args) {
		// 1~100사이 정수 중 5의 배수이자 7의 배수를 출력하라
		int num = 1;
//		boolean result = false;

		while (num < 100) {
			if ((num % 5 == 0) && (num % 7 == 0)) {
//				result = true;
//				break;
				System.out.println(num + " 은  5의 배수이자 7의 배수이다.");
			}
			num++;
		}

//		if (result == true) {
//			System.out.println(num + " 은  5의 배수이자 7의 배수이다.");
//		} else {
//			System.out.println("5의 배수이자 7의 배수를 찾지 못했습니다.");
//		}

	}
}
