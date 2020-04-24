package RandomEx;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			System.out.println(r.nextInt(1000));
		}
		System.out.println();
		Random r2 = new Random(10);
		for (int i = 0; i < 3; i++) {
			System.out.println(r2.nextInt(1000));
		}
		System.out.println();
		Random r3 = new Random(10);
		for (int i = 0; i < 3; i++) {
			System.out.println(r3.nextInt(1000));
		}

	}

}
