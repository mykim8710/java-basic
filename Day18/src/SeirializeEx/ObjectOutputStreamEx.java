package SeirializeEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectOutputStreamEx {
	public static void main(String[] args) {
		SBox b1 = new SBox("Toy");
		SBox b2 = new SBox("Apple");

		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Object2.bin"))) {
			o.writeObject(b1);
			o.writeObject(b2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
