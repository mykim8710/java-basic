package ExceptionEX;

public class ExceptionEx2 {
	public static void md1(int n) {
		md2(n, 0);
	}

	public static void md2(int n1, int n2) {
		int r = n1 / n2; // 예외발생 지점
	}

	public static void main(String[] args) {
		try {
			md1(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Good bye~!");
	}

}