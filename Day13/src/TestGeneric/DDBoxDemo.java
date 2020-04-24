package TestGeneric;

class DBox<T, S> {
	private T name;
	private S count;

	public void set(T name, S count) {
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return name + " & " + count;
	}

}

class DDBox<Q, P> {

	private Q box1;
	private P box2;

	public void set(Q box1, P box2) {
		this.box1 = box1;
		this.box2 = box2;
	}

	@Override
	public String toString() {
		return box1.toString() + "\n" + box2.toString();
	}

}

public class DDBoxDemo {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);

		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33 );

		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);
		System.out.println(ddbox);

	}

}
