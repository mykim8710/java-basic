/*Vector �÷����� �̿��Ͽ� �������� ����, �����ϴ� ���α׷��� �ۼ��϶�
 *�������� �Է��ϸ� ���Ϳ� �߰��ϰ� ���� �Է��� ��� �������� ����� ���
 *Vector<E> : List<E>�������̽��� ����
 **/

package TestExample;

import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static double getAvg(Vector<Integer> v) {
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			sum += v.get(i);
		}

		return (double) sum / v.size();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		Integer precipitation;

		while (true) {
			System.out.println();
			System.out.print("������ �Է�(0 �Է½� ����) >> ");
			precipitation = sc.nextInt();

			if (precipitation == 0) {
				break;
			}

			v.add(precipitation);
			System.out.print("������ ���� >> ");
			for (int a : v) {
				System.out.print(a + " ");
			}
			System.out.println();
			System.out.println("������� : " + VectorTest.getAvg(v));

		}

	}
}
