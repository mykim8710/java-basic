package BufferedDataStreamEx;

import java.io.*;

public class BufferedDataOutputStream {

	public static void main(String[] args) {
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")))) {
			out.writeInt(5805);
			out.writeDouble(3.14);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
