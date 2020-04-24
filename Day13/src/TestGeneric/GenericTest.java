package TestGeneric;

class GArray<T> {
	private T[] arr;

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	public void printArr() {
		for (T str : arr) {
			System.out.println(str);
		}
	}
}

public class GenericTest {
	public static void main(String[] args) {
		GArray<String> gt = new GArray<String>();
		String[] ss = { "바나나", "우유", "스택", "오렌지", "아이스아메리카노" };

		gt.setArr(ss);
		gt.printArr();

	}
}
