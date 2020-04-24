package GenericEx;

class Apple {
	@Override
	public String toString() {return "This is Apple";}
}

class Orange {
	@Override
	public String toString() {return "This is Orange";}
}

// Box : 제네릭 클래스로 지정
class Box<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}

public class BoxTest {
	public static void main(String[] args) {
		// 이 박스객체의 멤버들은 데이터 타입이 <Apple>로 결정
		Box<Apple> appleBox = new Box<Apple>();
		// 이 박스객체의 멤버들은 데이터 타입이 <Orange>로 결정
		Box<Orange> orangeBox = new Box<Orange>();	
		
		appleBox.setObj(new Apple());
		orangeBox.setObj(new Orange());
		
		Apple apple = appleBox.getObj();
		Orange orange = orangeBox.getObj();
		
		System.out.println(apple);
		System.out.println(orange);

	}
}
