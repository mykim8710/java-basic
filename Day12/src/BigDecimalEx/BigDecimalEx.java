package BigDecimalEx;

import java.math.BigDecimal;

public class BigDecimalEx {
	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("1.6");
		BigDecimal d2 = new BigDecimal("0.1");

		System.out.println("add result : " + d1.add(d2));
		System.out.println("multiply result : " + d1.multiply(d2));

		double b1 = 1.6;
		double b2 = 0.1;

		System.out.println(b1 + b2);
		System.out.println(b1 * b2);

		float f1 = 1.6f;
		float f2 = 0.1f;

		System.out.println(f1 + f2);
		System.out.println(f1 * f2);

		System.out.println(Math.random());

	}
}
