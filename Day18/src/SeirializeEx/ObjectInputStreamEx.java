package SeirializeEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) {
		try (ObjectInputStream i = new ObjectInputStream(new FileInputStream("Object.bin"))) {
			SBox b1 = (SBox) i.readObject();
			System.out.println(b1.get());
			SBox b2 = (SBox) i.readObject();
			System.out.println(b2.get());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
