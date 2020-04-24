package GenericEx;

class Box3<T extends Number> {
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
	@Override
	public String toString() {
		return "" +obj;
	}
}

public class BoxTest3 {
	public static void main(String[] args) {
		Box3<Integer> iBox = new Box3<>();
		iBox.set(24);
		System.out.println(iBox);
		
		
	}	
}
