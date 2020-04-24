package TestExample;

class Robot {

}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다 .");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class RobotTest {

	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
		} else if (r instanceof SingRobot) {
			SingRobot sr = (SingRobot) r;
			sr.sing();
		} else if (r instanceof DrawRobot) {
			DrawRobot dwr = (DrawRobot) r;
			dwr.draw();
		}
	}

	public static void main(String[] args) {
//		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
//
//		for (int i = 0; i < arr.length; i++) {
//			action(arr[i]);
//		}

		// Polymorphism
		Robot r1 = new DanceRobot();
		Robot r2 = new SingRobot();
		Robot r3 = new DrawRobot();

		action(r1);
		action(r2);
		action(r3);

	}

}
