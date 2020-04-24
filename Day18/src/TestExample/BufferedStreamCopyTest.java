package TestExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStreamCopyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("복사할 파일명을 입력 하세요 >> ");
		String sourceFile = sc.nextLine();

		System.out.print("복사본의 파일명을 입력 하세요 >> ");
		String copyFile = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(copyFile))) {

			int data;
			while (true) {
				data = br.read();
				if (data == -1) {
					break;
				}
				bw.write(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
