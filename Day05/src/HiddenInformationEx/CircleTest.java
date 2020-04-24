package HiddenInformationEx;

class Circle {
	private double rad;	//private : ���� Ŭ���� �������� ���� ����
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
		
//     �ν��Ͻ������� �ٷ� ������ �����ϳ� �Լ��� �����ϵ��� �ϴ°��� �´�
//		c.rad = -4.5;
//		System.out.println(c.getArea());

	}
}