package DeepCopyEx;

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

	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return (Circle) obj;
	}

	public Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}

}

public class DeepCopyTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(3, 6), 9);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);

		c1.p.x = 2;
		c1.p.y = 4;
		System.out.println();
		System.out.println("c1의 참조변수 멤버값을 변경 후 ");
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);

	}
}
