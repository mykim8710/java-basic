package EqualsEx;

class INum {
	private int num;

	public INum(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof INum)) {
			return false;
		} else {
			INum i = (INum) obj;
			return this.num == i.num;
		}

	}
}

public class Equals {
	public static void main(String[] args) {
		INum num1 = new INum(12);
		INum num2 = new INum(12);
		INum num3 = new INum(10);

		if (num1.equals(num2)) {
			System.out.println("num1, num2 내용이 같습니다.");
		} else {
			System.out.println("num1, num2 다릅니다.");
		}

		if (num1.equals(num3)) {
			System.out.println("num1, num3 내용이 같습니다.");
		} else {
			System.out.println("num1, num3 다릅니다.");
		}

	}
}
