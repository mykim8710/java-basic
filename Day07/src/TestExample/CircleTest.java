/*	Circle Ŭ������ CircleTestŬ������ �ϼ��Ͽ���
 *	3���� Circle ��ü�迭�� ����� 
 *	x, y, radius ���� �о� 3���� Circle ��ü�� ����� 
 *	show()�� �̿��Ͽ� �̸� ��� ����Ͽ���
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
