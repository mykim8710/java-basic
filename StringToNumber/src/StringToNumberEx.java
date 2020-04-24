import java.util.Scanner;

class StringToNumberEx {

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("input string");
		String str = scanner.nextLine();
				str = str.trim();
				str = str.replaceAll(" ", "");

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.format("%c %b\n", ch, Character.isDigit(ch));
		}

	}
}