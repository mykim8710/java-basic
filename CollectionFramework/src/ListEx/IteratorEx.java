package ListEx;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		for (int i = 65; i <= 90; i++) {
			String alphabat = (char) i + "";
			al.add(alphabat);
		}
		
		System.out.println();
		
		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}

		System.out.println();
		while (li.hasPrevious()) {
			System.out.print(li.previous() + " ");
		}
	}
}
