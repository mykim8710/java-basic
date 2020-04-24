package SingleThreadEx;

public class SingleThreadTest {
	public static void main(String[] args) {
		// 반복문에 실행
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
		
		// 위의 반복문의 실행이 끝난 뒤 아래의 반복문이 실행
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}

	}
}
