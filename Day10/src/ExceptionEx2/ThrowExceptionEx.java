package ExceptionEx2;

import java.io.*;

class B {
	void run() throws IOException {
		BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
		String input = bReader.readLine();
		System.out.println(input);
	}
}

class C {
	void run() throws IOException {
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionEx {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (IOException e) {
			System.out.println("out.txt 파일이 필요합니다.");
		}
	}
}
