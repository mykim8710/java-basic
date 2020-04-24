/* 국가명과 국가별 인구수를 scanner를 통해서 입력 받은 다음 HashMap에 저장, "stop"을 입력하면 입력중지
입력된 정보 중 , 국가명을 입력하면 해당국가의 인구수를 출력, HashMap에 없는 국가명을 입력했으면 
"해당국가는 목록에 없는 국가입니다." 출력     */

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

		System.out.println("국가명과 인구수를 입력하세요");

		while (true) {
			System.out.print("국가명, 인구(stop :입력종료) >> ");
			nation = sc.next();
			if (nation.equalsIgnoreCase("STOP")) { // 대소문자 상관없이 "stop"을 입력 받으면 반복문 종료
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
			System.out.print("인구검색(국가명) (stop :종료) >> ");
			nation = sc.next();
			if (nation.equalsIgnoreCase("STOP")) { // 대소문자 상관없이 "stop"을 입력 받으면 반복문 종료
				break;
			} else if (map.get(nation) != null) {
				System.out.println(nation + "의 인구는 " + map.get(nation) + "명 입니다");
			} else {
				System.out.println(nation + "는 목록에 없는 국가입니다.");
			}
		}
		sc.close();
	}
}
