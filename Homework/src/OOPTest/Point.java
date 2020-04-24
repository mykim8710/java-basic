package OOPTest;

public class Point {
	int x;
	int y;

	Point() {
		this(1, 1);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static double getDistance(Point p1, Point p2) {
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;
		return Math.sqrt(a * a + b * b);
	}

	public double getDistance(Point p) {
		return Point.getDistance(this, p);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		} else {
			Point p = (Point) obj;
			return this.x == p.x && this.y == p.y;
		}
	}

}
