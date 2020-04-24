package ExceptionEx2;

import java.io.IOException;

class E {
	void throwArithmeticException() {
		throw new ArithmeticException();
	}

	void throwIOException1() throws IOException {
		throw new IOException();
	}

	void throwIOException2() {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class ExceptionTest {
	public static void main(String[] args) {

	}
}
