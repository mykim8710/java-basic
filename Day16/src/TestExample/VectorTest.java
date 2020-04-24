/*Vector 컬럭션을 이용하여 강수량을 유지, 관리하는 프로그램을 작성하라
 *강수량을 입력하면 벡터에 추가하고 현재 입려괸 모든 강수량과 평균을 출력
 *Vector<E> : List<E>인터페이스를 구현
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
			System.out.print("강수량 입력(0 입력시 종료) >> ");
			precipitation = sc.nextInt();

			if (precipitation == 0) {
				break;
			}

			v.add(precipitation);
			System.out.print("강수량 분포 >> ");
			for (int a : v) {
				System.out.print(a + " ");
			}
			System.out.println();
			System.out.println("현재평균 : " + VectorTest.getAvg(v));

		}

	}
}
