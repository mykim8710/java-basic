package GenericMethodEx;

class Box<T> {
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}

class BoxFactory {
	public static <T> Box<T> makeBox(T obj) {
		Box<T> box = new Box<T>();
		box.set(obj);
		return box;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box<String> strBox = BoxFactory.<String>makeBox("Sweet");
		Box<Integer> intBox = BoxFactory.<Integer>makeBox(50);
		System.out.println(strBox.get());
		System.out.println(intBox.get());

	}
}
