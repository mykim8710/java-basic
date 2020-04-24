package MethodOverring;

class Cake1 {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake1 extends Cake1 {
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}

	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}

public class CakeTest2 {

	public static void main(String[] args) {

		Cake1 c1 = new CheeseCake1();
		CheeseCake1 c2 = new CheeseCake1();

		c1.yummy();
		c2.yummy();
		c2.tasty();

	}

}
