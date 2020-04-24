package ExceptionEx2;

class DivideException extends RuntimeException {
	public int left;
	public int right;

	DivideException() {
		super();
	}

	DivideException(String message, int right, int left) {
		super(message);
		this.right = right;
		this.left = left;
	}

}

class Calculator3 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		if (this.right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.", this.right, this.left);
		}
		System.out.print(this.left / this.right);
	}
}

public class MakeException {
	public static void main(String[] args) {
		Calculator3 c1 = new Calculator3();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}
}
