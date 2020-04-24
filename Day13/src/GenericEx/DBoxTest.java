package GenericEx;

class DBox<T, S> {
	private T name;
	private S age;

	public void setDBox(T name, S age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " & " + age;
	}

}

public class DBoxTest {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();

		box.setDBox("홍길동", 23);

		System.out.println(box);

	}
}
