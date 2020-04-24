package HiddenInformationEx;

class Circle {
	private double rad;	//private : 현재 클래스 내에서만 접근 가능
	final double PI = 3.14;

	public Circle(double r) {
		setRad(r);
	}

	public void setRad(double r) {
		if (r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}

	public double getArea() {
		return rad * rad * PI;
	}

}

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());

		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		
//     인스턴스변수에 바로 접근은 가능하나 함수로 접근하도록 하는것이 맞다
//		c.rad = -4.5;
//		System.out.println(c.getArea());

	}
}