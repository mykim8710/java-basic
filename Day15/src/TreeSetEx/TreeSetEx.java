package TreeSetEx;

import java.util.*;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(3);
		tree.add(5);
		tree.add(4);
		tree.add(2);
		tree.add(1);

		System.out.println("°´Ã¼ ¼ö : " + tree.size());

		Iterator<Integer> itr = tree.iterator(); 
		while (itr.hasNext()) {
			System.out.print(itr.next().toString() + "\t");
		}

	}
}
