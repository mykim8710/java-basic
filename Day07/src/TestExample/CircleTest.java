/*	Circle 클래스와 CircleTest클래스를 완성하여라
 *	3개의 Circle 객체배열을 만들고 
 *	x, y, radius 값을 읽어 3개의 Circle 객체를 만들고 
 *	show()를 이용하여 이를 모두 출력하여라
 */

package TestExample;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Circle[] circle = new Circle[3];

//		for (Circle circle : c) {
//			System.out.print("x, y, radius >> ");
//			double x = scanner.nextDouble();
//			double y = scanner.nextDouble();
//			int radius = scanner.nextInt();
//			circle = new Circle(x, y, radius);
//		}
//
//		for (Circle circle : c) {
//			circle.show();
//		}	

		for (int i = 0; i < circle.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			circle[i] = new Circle(x, y, radius);
		}

		for (int i = 0; i < circle.length; i++) {
			circle[i].show();
		}

	}
}
