package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("apple");
		list.add("orange");
		list.add("grape");
		list.add("lemon");

		System.out.println("list size : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();
		for (String str : list) {
			System.out.println(str);
		}

		list.remove(0);
		System.out.println();
		System.out.println("list size : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
