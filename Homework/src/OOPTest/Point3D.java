package OOPTest;

public class Point3D extends Point {
	int z;

	public Point3D() {
		this(1, 1, 1);
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return super.toString() + " z = " + z;

	}

}
