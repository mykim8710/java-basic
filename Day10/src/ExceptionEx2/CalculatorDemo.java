package ExceptionEx2;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		if (right == 0) {
			throw new ArithmeticException("0으로 나눌수 없습니다.");
		}

		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left / this.right);
			System.out.print(" 입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);

		try {
			c1.divide();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
