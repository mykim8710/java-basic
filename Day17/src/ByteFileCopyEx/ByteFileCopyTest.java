// 바이트 단위 파일 복사 프로그램

package ByteFileCopyEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ByteFileCopyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Original : ");
		String src = sc.nextLine();
		System.out.print("Copy : ");
		String cpy = sc.nextLine();

		try (InputStream input = new FileInputStream(src); OutputStream output = new FileOutputStream(cpy)) {
			int data;
			while (true) {
				data = input.read();
				if (data == -1) {
					break;
				} else {
					output.write(data);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
