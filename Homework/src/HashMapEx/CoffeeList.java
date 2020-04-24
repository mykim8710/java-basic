/* HashMap<String, Integer> 컬렉션을 생성하고 
 * “에스프레소”는 2000, “아메리카노”는 2500, “카푸치노”는 3000, “카페라테”는 3500을 저장하라. 
 * 그리고 다음과 같이 음료수 이름을 입력받으면 HashMap에서 검색하여 가격을 출력하라.
==========================================
에스프레소, 아메리카노, 카푸치노, 카페라떼가 있습니다.
주문>> 아메리카노
아메리카노는 2500원 입니다.

주문>> 카푸치노
카푸치노는 3000원 입니다.

주문>> 그만*/

package HashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CoffeeList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> coffee = new HashMap<>();

		coffee.put("에스프레소", 2000);
		coffee.put("아메리카노", 2500);
		coffee.put("카푸치노", 3000);
		coffee.put("까페라떼", 3500);
		coffee.put("바닐라라떼", 4000);

		Set<String> key = coffee.keySet();
		System.out.print("메   뉴 : ");
		for (String str : key) {
			System.out.print(str + "   ");
		}
		System.out.println();

		while (true) {
			System.out.print("주문 >> ");
			String name = sc.next();

			if (name.equals("그만")) {
				break;
			} else if (coffee.get(name) != null) {
				System.out.println(name + "는 " + coffee.get(name) + "원 입니다.");

			} else {
				System.out.println(name + "은 메뉴에 없습니다.");
			}

		}

	}
}
