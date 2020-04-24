package FileReaderEx;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileReaderEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("읽을 파일명 입력 >> ");
		String src = sc.nextLine();

		try (Reader in = new FileReader(src)) {
			int ch;
			while (true) {
				ch = in.read();
				if (ch == -1) {
					break;
				} else {
					System.out.print((char) ch);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
