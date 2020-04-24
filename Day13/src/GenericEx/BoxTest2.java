package GenericEx;

class Box2<T> {
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}

public class BoxTest2 {
	public static void main(String[] args) {
		Box2<String> box1 = new Box2<>();
		box1.set("I'm so happy");

		Box2<Box2<String>> box2 = new Box2<>();
		box2.set(box1);

		Box2<Box2<Box2<String>>> box3 = new Box2<>();
		box3.set(box2);

		System.out.println(box3.get().get().get());

	}
}
