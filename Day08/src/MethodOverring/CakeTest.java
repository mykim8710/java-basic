package MethodOverring;

class Cake {
	public void yummy() {
		System.out.println("Yummy Cake!!");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("Yummy CheeseCake!!");
	}
}

class StrawberryCake extends CheeseCake {
	public void yummy() {
		System.out.println("Yummy StrawberryCake!!");
	}
}

public class CakeTest {

	public static void main(String[] args) {
		Cake cake1 = new StrawberryCake();
		CheeseCake cake2 = new StrawberryCake();
		StrawberryCake cake3 = new StrawberryCake();

		cake1.yummy();
		cake2.yummy();
		cake3.yummy();

	}

}
