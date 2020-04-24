/*	다음의 클래스와 클래스 메서드를 만드시오.
	클래스 명:  MyMath
	메서드1: myMin(static)
	파라미터: int 배열
	리턴값  : 배열의 값 중 최소값

	메서드2: myMax(static)
	파라미터: int 배열
	리턴값 : 배열의 값 중 최소값

	테스트 클래스 MyMathTest를 만든후 int 배열 5개를 키보드 입력으로 받은후 myMin, myMax 함수 호출할것 */

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
