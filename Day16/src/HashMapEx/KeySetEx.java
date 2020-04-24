package HashMapEx;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class KeySetEx {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(45, "lee");
		map.put(37, "kim");
		map.put(23, "park");

		Set<Integer> ks = map.keySet();

		for (Integer key : ks) {
			System.out.print(key.toString() + "\t");
		}

		System.out.println();
		for (Integer key : ks) {
			System.out.print(map.get(key).toString() + "\t");
		}

		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();

		map2.put(45, "lee");
		map2.put(37, "kim");
		map2.put(23, "park");

		Set<Integer> ks2 = map2.keySet();

		System.out.println();
		for (Integer key2 : ks2) {
			System.out.print(key2.toString() + "\t");
		}

		System.out.println();
		for (Integer key2 : ks2) {
			System.out.print(map2.get(key2).toString() + "\t");
		}

	}
}
