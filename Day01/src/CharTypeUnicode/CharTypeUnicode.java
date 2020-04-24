package CharTypeUnicode;

public class CharTypeUnicode {
	public static void main(String[] args) {
		char ch1 = '헐';
		char ch2 = '확';
		char ch3 = 54736;		//unicode
		char ch4 = 54869;		//unicode
		char ch5 = 0xD5D0;		// 16����
		char ch6 = 0xD655;		// 16����
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
	}
}
