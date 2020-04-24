package ArrayEx;

public class ArrayLoopEx {

	public static void main(String[] args) {
		String[] str = new String[7];
		str[0] = "java";
		str[1] = "system";
		str[2] = "compiler";
		str[3] = "park";
		str[4] = "tree";
		str[5] = "dinner";
		str[6] = "brunch cafe";

		int count = 0;
		for (int i = 0; i < str.length; i++) {
			count = count + str[i].length();
		}

		System.out.printf("총 문자의 수 : %d", count);

		boolean[] a2 = new boolean[5];
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
		
		char[] a3 = new char[5];
		for (int i = 0; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
		

	}

}
