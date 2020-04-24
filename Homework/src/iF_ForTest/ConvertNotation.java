/*10진수 → n진법

input : 10진수(int) / n(진법) (String)
output : 해당 n진법으로 변환된 n진법의 수(int)  */

package iF_ForTest;

import java.util.Scanner;

public class ConvertNotation {

	public static String convertNotation(int decimal, int notation, char[] ch) {
		int index = ch.length - 1;
		String str = "0123456789ABCDEF";

		while (decimal != 0) {
			ch[index--] = str.charAt(decimal % notation);
			decimal = decimal / notation;
		}

		String str2 = "";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '\u0000') {
				continue;
			} else {
				str2 += ch[i];
			}
		}
		return str2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] ch = new char[32];
		int decimal = sc.nextInt();
		int notation = sc.nextInt();

		String result = convertNotation(decimal, notation, ch);
		System.out.println(result);

	}

}
