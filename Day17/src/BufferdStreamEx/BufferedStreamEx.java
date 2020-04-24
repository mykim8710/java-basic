package BufferdStreamEx;
import java.io.*;
import java.util.*;

public class BufferedStreamEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원본파일 >> ");
		String src = sc.nextLine();

		System.out.print("사본파일 >> ");
		String cpy = sc.nextLine();

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(cpy))) {
			int data;
			while (true) {
				data = in.read();
				if (data == -1) {
					break;
				} else {
					out.write(data);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
