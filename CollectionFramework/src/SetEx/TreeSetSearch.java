package SetEx;

import java.util.TreeSet;

public class TreeSetSearch {
	public static void main(String[] args) {
		TreeSet<String> setString = new TreeSet<>();
		String from = "b";
		String to = "d";
			
		setString.add("abc"); setString.add("alien"); setString.add("bat");
		setString.add("cart"); setString.add("Cart"); setString.add("disc");
		setString.add("dance"); setString.add("dZZZZ"); setString.add("dzzzz");
		setString.add("elephant"); setString.add("elevator"); setString.add("fan");
		setString.add("flower");

		System.out.println(setString); // [Cart, abc, alien, bat, cart, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
												// 대문자가 소문자 보다 우선하기 때문에 Cart가 제일 처음에 위치
												// 대소문자가 섞여있으면 의도치않은 검색결과를 얻을 수 있음
		System.out.println("Range Search : from " + from + " to " + to);
		System.out.println("Result 1 : " +setString.subSet(from, to));  // 시작범위는 포함되지만 끝범위는 포함되 않음
																						  // Result 1 : [bat, cart]
	}
}
