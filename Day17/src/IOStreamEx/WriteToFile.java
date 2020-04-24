package IOStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFile {
	public static void main(String[] args) {
		try (OutputStream out = new FileOutputStream("test.dat")) {

			out.write(5);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
