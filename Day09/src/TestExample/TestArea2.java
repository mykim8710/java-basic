package TestExample;

interface IArea2 {
	public abstract double area();
}

class Triangle2 implements IArea2 {
	private double height, width;

	public Triangle2(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height * width * 0.5;
	}

}

class Rectangle2 implements IArea2 {
	private double height, width;

	public Rectangle2(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}
}

public class TestArea2 {

	public static void main(String[] args) {
		IArea2 ia = new Triangle2(155, 125);
		System.out.println("»ï°¢Çü ³ÐÀÌ : " + ia.area());

		ia = new Rectangle2(155, 125);
		System.out.println("»ç°¢Çü ³ÐÀÌ : " + ia.area());

	}

}
