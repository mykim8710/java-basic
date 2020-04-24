package ArraysEx;

import java.util.Arrays;

public class ArrayCopyEx {
	public static void main(String[] args) {
		double[] org = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		double[] cpy = new double[3];

		System.arraycopy(org, 1, cpy, 0, 3);
		Arrays.equals(org, cpy);
		
		System.out.println(Arrays.toString(cpy));
		
		for (double d : cpy) {
			System.out.print(d + "\t");
		}
	}
}
