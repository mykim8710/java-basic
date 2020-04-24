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
	String[] moneyString = { "5������", "1������", "5õ����", "1õ����", "500����", "100����", "50����", "10����", "1����" };
	int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
	DecimalFormat df1 = new DecimalFormat("#,##0");
	DecimalFormat df2 = new DecimalFormat("#,##0.00");

	@Override
	public void changeWONToDollar() {

		do {
			System.out.print("��ȭ�� �Է��ϼ���(���� : ��) >> ");
			try {
				int krw = sc.nextInt();
				double usd = (double) krw / EXCHANGE_RATE;
				System.out.println(df1.format(krw) + "���� $" + df2.format(usd) + "�Դϴ�.");
				break;
			} catch (Exception e) {
				System.out.println("��ȿ���� �ʴ� ���� �Էµƽ��ϴ�. �ٽ� �Է����ּ���(���ڸ� �Է�)\n");
				sc = new Scanner(System.in);
			}
		} while (true);

	}

	@Override
	public void showMeTheMoney() {

		do {
			System.out.print("�ݾ��� �Է��ϼ���(���� : ��) >> ");
			try {
				int inputMoney = sc.nextInt();
				int ea;
				int count = 0;
				System.out.println();
				System.out.println(df1.format(inputMoney) + "��");
				for (int i = 0; i < money.length; i++) {
					ea = inputMoney / money[i];
					inputMoney = inputMoney % money[i];
					System.out.println(moneyString[i] + " : " + ea + "��");
					count += ea;
				}
				System.out.println(count + "��");
				break;
			} catch (Exception e) {
				System.out.println("��ȿ���� �ʴ� ���� �Էµƽ��ϴ�. �ٽ� �Է����ּ���(���ڸ� �Է�)\n");
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
