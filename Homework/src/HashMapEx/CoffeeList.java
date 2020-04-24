/* HashMap<String, Integer> �÷����� �����ϰ� 
 * �����������ҡ��� 2000, ���Ƹ޸�ī�롱�� 2500, ��īǪġ�롱�� 3000, ��ī����ס��� 3500�� �����϶�. 
 * �׸��� ������ ���� ����� �̸��� �Է¹����� HashMap���� �˻��Ͽ� ������ ����϶�.
==========================================
����������, �Ƹ޸�ī��, īǪġ��, ī��󶼰� �ֽ��ϴ�.
�ֹ�>> �Ƹ޸�ī��
�Ƹ޸�ī��� 2500�� �Դϴ�.

�ֹ�>> īǪġ��
īǪġ��� 3000�� �Դϴ�.

�ֹ�>> �׸�*/

package HashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CoffeeList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> coffee = new HashMap<>();

		coffee.put("����������", 2000);
		coffee.put("�Ƹ޸�ī��", 2500);
		coffee.put("īǪġ��", 3000);
		coffee.put("�����", 3500);
		coffee.put("�ٴҶ��", 4000);

		Set<String> key = coffee.keySet();
		System.out.print("��   �� : ");
		for (String str : key) {
			System.out.print(str + "   ");
		}
		System.out.println();

		while (true) {
			System.out.print("�ֹ� >> ");
			String name = sc.next();

			if (name.equals("�׸�")) {
				break;
			} else if (coffee.get(name) != null) {
				System.out.println(name + "�� " + coffee.get(name) + "�� �Դϴ�.");

			} else {
				System.out.println(name + "�� �޴��� �����ϴ�.");
			}

		}

	}
}
