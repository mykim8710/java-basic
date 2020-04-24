package StringClassEx;

public class Test {
	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		StringBuffer stb1 = new StringBuffer("abc");
		System.out.println(stb1);
		stb1.append("123");
		System.out.println(stb1);

	}
}
