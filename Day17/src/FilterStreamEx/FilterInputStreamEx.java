package FilterStreamEx;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FilterInputStreamEx {
	public static void main(String[] args) {
		try (DataInputStream in = new DataInputStream(new FileInputStream("src.txt"))) {
			int num1 = in.readInt();
			double num2 = in.readDouble();
			char ch1 = in.readChar();
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(ch1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
