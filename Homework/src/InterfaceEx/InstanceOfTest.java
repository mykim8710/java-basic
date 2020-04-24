package InterfaceEx;

class Robot {}
class DanceRobot extends Robot {void dance() {System.out.println("���� ��ϴ�.");}}
class SingRobot extends Robot {void sing() {System.out.println("�뷡�� �մϴ� .");}}
class DrawRobot extends Robot {void draw() {System.out.println("�׸��� �׸��ϴ�.");}}

public class InstanceOfTest {

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

		// Polymorphism
		Robot r1 = new DanceRobot();
		Robot r2 = new SingRobot();
		Robot r3 = new DrawRobot();

		action(r1);
		action(r2);
		action(r3);
	}

}