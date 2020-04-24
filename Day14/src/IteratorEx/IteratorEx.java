package IteratorEx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorEx {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();
		itr = list.iterator();

		String str;
		while (itr.hasNext()) {
			str = itr.next();
			if (str.equals("Box")) {
				itr.remove();
			}
		}

		itr = list.iterator();

		while (itr.hasNext()) {
			System.err.println(itr.next());
		}
		
	}
}
