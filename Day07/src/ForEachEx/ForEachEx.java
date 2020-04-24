package ForEachEx;

public class ForEachEx {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
}
