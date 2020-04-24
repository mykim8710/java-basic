package ConstantEx;

public class LiteralEx {
	public static void main(String[] args) {
		byte seven = 0B111;			//0B : 2Áø¼ö
		int num205 = 0B11001101;
		int num1 = 100_000_000;
		int num2 = 12_34_56_78_90;
		double num3 = 3.4e3;
		double num4 = 3.4e-3;
		
		char a = 'A';
		int num5 = 65;
		long u1 = 3000000007L;
		int u2 = (int)u1;
		
		System.out.println(seven);
		System.out.println(num205);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println((int)a);
		System.out.println((char)num5);
		System.out.println(u2);


//		for(char i = 'a'; i <= 'z'; i++) {
//			System.out.println(i);
//		}
		

	}
}
