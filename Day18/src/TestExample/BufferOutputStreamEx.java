package TestExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BufferOutputStreamEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrString = new ArrayList<String>();

		while (true) {
			System.out.println("저장할 내용을 입력하세요(Q는 종료)");
			String str = sc.nextLine();

			if (str.equalsIgnoreCase("q")) {
				break;
			} else {
				arrString.add(str);
			}

		}

		System.out.print("저장파일명 입력 >> ");
		String fileName = sc.nextLine();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			for (String s : arrString) {
				bw.write(s, 0, s.length());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
