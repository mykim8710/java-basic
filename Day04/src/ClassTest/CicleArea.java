package ClassTest;

class CicleArea {

//	final double PI = 3.14;
	double radius;

	CicleArea(double radius) {
		if (radius < 0) {
			System.out.println("�������� �Է��ϼ̽��ϴ�.");
		} else {
			this.radius = radius;
		}
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}
