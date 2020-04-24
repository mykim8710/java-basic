/* ������� ������ �α����� scanner�� ���ؼ� �Է� ���� ���� HashMap�� ����, "stop"�� �Է��ϸ� �Է�����
�Էµ� ���� �� , �������� �Է��ϸ� �ش籹���� �α����� ���, HashMap�� ���� �������� �Է������� 
"�ش籹���� ��Ͽ� ���� �����Դϴ�." ���     */

package HashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class NationPopulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String nation;
		Integer population;

		System.out.println("������� �α����� �Է��ϼ���");

		while (true) {
			System.out.print("������, �α�(stop :�Է�����) >> ");
			nation = sc.next();
			if (nation.equalsIgnoreCase("STOP")) { // ��ҹ��� ������� "stop"�� �Է� ������ �ݺ��� ����
				break;
			} else {
				population = sc.nextInt();
				map.put(nation, population);
			}
		}

		System.out.println();
		Set<String> ks = map.keySet();

		System.out.println();
		for (String str : ks) {
			System.out.print(str + "\t");
		}

		System.out.println();
		for (String str : ks) {
			System.out.print(map.get(str).toString() + "\t");
		}

		System.out.println();
		while (true) {
			System.out.print("�α��˻�(������) (stop :����) >> ");
			nation = sc.next();
			if (nation.equalsIgnoreCase("STOP")) { // ��ҹ��� ������� "stop"�� �Է� ������ �ݺ��� ����
				break;
			} else if (map.get(nation) != null) {
				System.out.println(nation + "�� �α��� " + map.get(nation) + "�� �Դϴ�");
			} else {
				System.out.println(nation + "�� ��Ͽ� ���� �����Դϴ�.");
			}
		}
		sc.close();
	}
}
