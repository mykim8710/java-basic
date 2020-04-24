package ByteFileCopyEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FastByteFileCopyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Original : ");
		String src = sc.nextLine();
		System.out.print("Copy : ");
		String cpy = sc.nextLine();

		try (InputStream input = new FileInputStream(src); OutputStream output = new FileOutputStream(cpy)) {
			byte[] buffer = new byte[1024];
			int length;

			while (true) {
				length = input.read(buffer);
				if (length == -1) {
					break;
				} else {
					output.write(buffer, 0, length);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
