package ClassTest;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ����, ��������� �����Է� >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int engilsh = scanner.nextInt();

		Grade me = new Grade(math, science, engilsh);
		System.out.println("����� " + me.average());

	}
}
