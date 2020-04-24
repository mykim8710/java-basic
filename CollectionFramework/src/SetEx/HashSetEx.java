package SetEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Object[] obj = { "1", new Integer(1), "2", 2, "3", "3", "4", "4", "5" };
		Set set = new HashSet();
		for (int i = 0; i < obj.length; i++) {
			set.add(obj[i]);
		}

		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
