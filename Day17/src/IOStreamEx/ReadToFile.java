package IOStreamEx;

import java.io.FileInputStream;	
import java.io.IOException;
import java.io.InputStream;

public class ReadToFile {
	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("1234.txt");) {

			int data = in.read();
			int data2 = in.read();


			System.out.println(data);
			System.out.println(data2);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
