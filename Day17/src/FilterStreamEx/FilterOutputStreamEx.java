package FilterStreamEx;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilterOutputStreamEx {
	public static void main(String[] args) {
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("src.txt"))) {
			out.writeInt(5600);
			out.writeDouble(3.14);
			out.writeChar(65);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
