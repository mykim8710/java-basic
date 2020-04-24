package CloneEx;

class Point implements Cloneable {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", x, y);
		System.out.println();
	}

//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	@Override
	public Point clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return (Point) obj;
	}

}

public class InstanceClone {
	public static void main(String[] args) {
		Point p1 = new Point(3, 6);
		Point p2;

		try {
			p2 = p1.clone();
			p1.showPosition();
			p2.showPosition();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
