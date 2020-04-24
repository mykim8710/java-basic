package InterfaceEx;

import java.text.DecimalFormat;
import java.util.Scanner;

interface IProblem {
	public static final int EXCHANGE_RATE = 1100;

	public abstract void changeWONToDollar();
	public abstract void showMeTheMoney();
}

class MoneyProblem implements IProblem {
	Scanner sc = new Scanner(System.in);
	String[] moneyString = { "5만원권", "1만원권", "5천원권", "1천원권", "500원권", "100원권", "50원권", "10원권", "1원권" };
	int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
	DecimalFormat df1 = new DecimalFormat("#,##0");
	DecimalFormat df2 = new DecimalFormat("#,##0.00");

	@Override
	public void changeWONToDollar() {

		do {
			System.out.print("원화를 입력하세요(단위 : 원) >> ");
			try {
				int krw = sc.nextInt();
				double usd = (double) krw / EXCHANGE_RATE;
				System.out.println(df1.format(krw) + "원은 $" + df2.format(usd) + "입니다.");
				break;
			} catch (Exception e) {
				System.out.println("유효하지 않는 값을 입력됐습니다. 다시 입력해주세요(숫자만 입력)\n");
				sc = new Scanner(System.in);
			}
		} while (true);

	}

	@Override
	public void showMeTheMoney() {

		do {
			System.out.print("금액을 입력하세요(단위 : 원) >> ");
			try {
				int inputMoney = sc.nextInt();
				int ea;
				int count = 0;
				System.out.println();
				System.out.println(df1.format(inputMoney) + "원");
				for (int i = 0; i < money.length; i++) {
					ea = inputMoney / money[i];
					inputMoney = inputMoney % money[i];
					System.out.println(moneyString[i] + " : " + ea + "개");
					count += ea;
				}
				System.out.println(count + "장");
				break;
			} catch (Exception e) {
				System.out.println("유효하지 않는 값을 입력됐습니다. 다시 입력해주세요(숫자만 입력)\n");
				sc = new Scanner(System.in);
			}
		} while (true);

	}
}

public class MoneyProblemTest {
	public static void main(String[] args) {
		IProblem money = new MoneyProblem();
		money.changeWONToDollar();
		System.out.println();
		money.showMeTheMoney();

	}
}
