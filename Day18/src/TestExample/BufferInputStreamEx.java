package TestExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferInputStreamEx {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("File Name >> ");
		String fileName = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String str;
			while (true) {
				str = br.readLine();
				if (str == null) {
					break;
				}

				System.out.println("대문자 변경 전 : " + str);
				System.out.println("대문자 변경 후 : " + str.toUpperCase());
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
