package ClassTest;

class CicleArea {

//	final double PI = 3.14;
	double radius;

	CicleArea(double radius) {
		if (radius < 0) {
			System.out.println("음수값을 입력하셨습니다.");
		} else {
			this.radius = radius;
		}
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}
