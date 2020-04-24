package HashMapEx;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "lee");
		map.put(2, "kim");
		map.put(3, "park");

		System.out.println("no.1 : " + map.get(1));
		System.out.println("no.2 : " + map.get(2));
		System.out.println("no.3 : " + map.get(3));

		map.remove(2);

		System.out.println("no.2 : " + map.get(2));

	}
}
