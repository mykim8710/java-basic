package StringClassEx;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder strBud = new StringBuilder("123");
		
		strBud.append(45678);
		System.out.println(strBud.toString());

		strBud.delete(0, 2);
		System.out.println(strBud.toString());

		strBud.replace(0, 3, "AB");
		System.out.println(strBud.toString());

		strBud.reverse();
		System.out.println(strBud.toString());

		String sub = strBud.substring(2, 4);
		System.out.println(sub);

	}
}
