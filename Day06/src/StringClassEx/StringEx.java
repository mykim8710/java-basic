package StringClassEx;

public class StringEx {
	public static void main(String[] args) {
		String str1 = "Lexicographically";
		String str2 = "lexicographically";
		int temp;

		if (str1.equals(str2)) {
			System.out.println("두문자열은 같습니다.");
		} else {
			System.out.println("두문자열은 다릅니다.");
		}

		temp = str1.compareTo(str2);
		if (temp == 0) {
			System.out.println("두문자열은 같습니다.");
		} else if (temp < 0) {
			System.out.println("사전의 앞에 위치하는 문자 : " + str1);
		} else if (temp > 0) {
			System.out.println("사전의 앞에 위치하는 문자 : " + str2);
		}

		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("두문자열은 같습니다.");
		} else {
			System.out.println("두문자열은 다릅니다.");
		}

	}

}
