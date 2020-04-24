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

		System.out.println("연산할 두 수를 입력하세요.");
		while (true) {
			try {
				a = sc.nextDouble();
				b = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("유효하지 않은 값이 입력되었습니다");
				System.out.println("연산할 두 수를 다시 입력하세요.");
				sc = new Scanner(System.in);
			}

		}

		String operator;
		do {
			System.out.println("연산기호를 입력하세요 >> ( + ) ( - ) ( * ) ( / )");
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
			System.out.println("덧셈결과 >> " + a + " " + operator + " " + b + " = " + ic.calculate());
			break;
		case "-":
			ic = new Sub();
			ic.setValue(a, b);
			System.out.println("뺄셈결과 >> " + a + " " + operator + " " + b + " = " + ic.calculate());
			break;
		case "*":
			ic = new Mul();
			ic.setValue(a, b);
			System.out.println("곱셈결과 >> " + a + " " + operator + " " + b + " = " + ic.calculate());
			break;
		case "/":
			if (b != 0) {
				ic = new Div();
				ic.setValue(a, b);
				System.out.println("나눗셈결과 >> " + a + " " + operator + " " + b + " = " + ic.calculate());
				break;
			} else {
				System.out.println("B가 0입니다. 0으로 나눌 수 없습니다.");
				double rb;
				double temp;

				do {
					System.out.println("B값을 다시 입력하세요.");
					rb = sc.nextDouble();
					temp = rb;
				} while (temp == 0);

				ic = new Div();
				ic.setValue(a, temp);
				System.out.println("나눗셈결과 >> " + a + " " + operator + " " + temp + " = " + ic.calculate());
				break;
			}
		}
	}

}
