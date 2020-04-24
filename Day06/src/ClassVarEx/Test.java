package ClassVarEx;

class TestClass {
	void instanceMethod() {
	}

	static void staticMethod() {
	}

	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}

	static void staticMethod2() {
//		instanceMethod();
		staticMethod();
	}

}

class AAA {
	int num = 0;

	static void addNum(int n) {
//		num = num + n;
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println();
	}
}
