package WrapperClass;

import java.math.BigDecimal;

public class WrapperStaticEx {
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(5);
		Integer i2 = Integer.valueOf("1024");

		System.out.println("max value : " + Integer.max(i1, i2));
		System.out.println("min value : " + Integer.min(i1, i2));
		System.out.println("sum : " + Integer.sum(i1, i2));
		System.out.println();

		System.out.println("10(decimal) to binary : " + Integer.toBinaryString(12));
		System.out.println("10(decimal) to octal : " + Integer.toOctalString(12));
		System.out.println("10(decimal) to hex : " + Integer.toHexString(12));
		
	}
}
