package GenericEx;

class Box<T> {
	protected T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}

class EmptyBoxFactory extends Box {
	public static <T> Box<T> makebox() {
		Box<T> box = new Box<T>();
		return box;
	}

}

public class BoxFactoryTest {
	public static void main(String[] args) {
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makebox();
		iBox.set(25);
		System.out.println(iBox.get());

	}
}
