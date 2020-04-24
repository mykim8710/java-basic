package OOPTest;

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point();
		p.x = 3;
		p.y = 5;
		System.out.println(p);

		Point p2 = new Point();
		System.out.println(p2); // 1,1

		Point p3 = new Point(7, 9);
		System.out.println(p3); // 7, 9

		System.out.println(p2 + " 와 " + p3 + " 사이의 거리는 " + Point.getDistance(p2, p3));

		Point p4 = new Point(4, 6);
		System.out.println(p4 + " 와 " + p3 + " 사이의 거리는 " + p4.getDistance(p3));

		System.out.println(p4.equals(p2));
		System.out.println(p4.equals(p4));

		Point p5 = new Point(4, 6);
		System.out.println(p5.equals(p4));

		Point3D pp3 = new Point3D(1, 5, 6);
		System.out.println(pp3);

	}

}
