package InheritanceConstructorEx;

import java.util.InputMismatchException;
import java.util.Scanner;

interface ICalc {
	public abstract void setValue(double a, double b);
	public abstract double calculate();
}

class Calc implements ICalc {
	protected double a, b;

	@Override
	public void setValue(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double calculate() {
		return 0;
	}

}

class Add extends Calc {
	@Override
	public double calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	@Override
	public double calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	@Override
	public double calculate() {
		return a * b;
	}
}

class Div extends Calc {
	@Override
	public double calculate() {
		return a / b;
	}
}

public class CalcTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a;
		double b;

		System.out.println("������ �� ���� �Է��ϼ���.");
		while (true) {
			try {
				a = sc.nextDouble();
				b = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("��ȿ���� ���� ���� �ԷµǾ����ϴ�");
				System.out.println("������ �� ���� �ٽ� �Է��ϼ���.");
				sc = new Scanner(System.in);
			}

		}

		String operator;
		do {
			System.out.println("�����ȣ�� �Է��ϼ��� >> ( + ) ( - ) ( * ) ( / )");
			operator = sc.next();
		} while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")));

		CalcTest.getResult(a, b, operator);

	}

	public static void getResult(double a, double b, String operator) {
		ICalc ic;
		switch (operator) {
		case "+":
			ic = new Add();
			ic.setValue(a, b);
			System.out.println("������� >> " + a + " " + operator + " " + b + " = " + ic.calculate());
			break;
		case "-":
			ic = new Sub();
			ic.setValue(a, b);
			System.out.println("������� >> " + a + " " + operator + " " + b + " = " + ic.calculate());
			break;
		case "*":
			ic = new Mul();
			ic.setValue(a, b);
			System.out.println("������� >> " + a + " " + operator + " " + b + " = " + ic.calculate());
			break;
		case "/":
			if (b != 0) {
				ic = new Div();
				ic.setValue(a, b);
				System.out.println("��������� >> " + a + " " + operator + " " + b + " = " + ic.calculate());
				break;
			} else {
				System.out.println("B�� 0�Դϴ�. 0���� ���� �� �����ϴ�.");
				double rb;
				double temp;

				do {
					System.out.println("B���� �ٽ� �Է��ϼ���.");
					rb = sc.nextDouble();
					temp = rb;
				} while (temp == 0);

				ic = new Div();
				ic.setValue(a, temp);
				System.out.println("��������� >> " + a + " " + operator + " " + temp + " = " + ic.calculate());
				break;
			}
		}
	}

}
