package TestExample;

interface IArea {
	public abstract double area(double a, double b);
}

class Triangle implements IArea {

	@Override
	public double area(double height, double width) {
		return height * width * 0.5;
	}

}

class Rectangle implements IArea {

	@Override
	public double area(double height, double width) {
		return height * width;
	}
}

public class TestArea {

	public static void main(String[] args) {
		IArea ia = new Triangle();
		System.out.println("�ﰢ�� ���� : " + ia.area(5, 10));

		ia = new Rectangle();
		System.out.println("�簢�� ���� : " + ia.area(5, 10));

	}

}
