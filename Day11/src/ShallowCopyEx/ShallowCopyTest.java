package ShallowCopyEx;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}

class Circle implements Cloneable {
	Point p;
	double r;

	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	@Override
	public String toString() {
		return p.toString() + "   r = " + r;
	}

	@Override
	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Circle) obj;
	}

}

public class ShallowCopyTest {
	public static void main(String[] args) {
		Point p = new Point(1, 1);
		System.out.println(p);
		Circle c1 = new Circle(p, 5.0);
		Circle c2 = c1.clone(); // shallow copy

		System.out.println(c1);
		System.out.println(c2);

	}
}
