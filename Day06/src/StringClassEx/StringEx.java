package StringClassEx;

public class StringEx {
	public static void main(String[] args) {
		String str1 = "Lexicographically";
		String str2 = "lexicographically";
		int temp;

		if (str1.equals(str2)) {
			System.out.println("�ι��ڿ��� �����ϴ�.");
		} else {
			System.out.println("�ι��ڿ��� �ٸ��ϴ�.");
		}

		temp = str1.compareTo(str2);
		if (temp == 0) {
			System.out.println("�ι��ڿ��� �����ϴ�.");
		} else if (temp < 0) {
			System.out.println("������ �տ� ��ġ�ϴ� ���� : " + str1);
		} else if (temp > 0) {
			System.out.println("������ �տ� ��ġ�ϴ� ���� : " + str2);
		}

		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("�ι��ڿ��� �����ϴ�.");
		} else {
			System.out.println("�ι��ڿ��� �ٸ��ϴ�.");
		}

	}

}
