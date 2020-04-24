package InfiniteLoop;

public class InfiniteLoop {
	public static void main(String[] args) {
		int a = 1;

		while (true) {
			if ((a % 6 == 0) && (a % 14) == 0) {
				break;
			}
			a++;
		}

		System.out.println(a);

	}
}
