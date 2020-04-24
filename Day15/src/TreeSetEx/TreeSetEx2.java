package TreeSetEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TreeSetEx2 {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Box", "Toy", "Toy", "Box");
		ArrayList<String> list = new ArrayList<String>(lst);

		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
		HashSet<String> set = new HashSet<String>(list);

		list = new ArrayList<String>(set);

		for (String str : list) {
			System.out.print(str + "\t");
		}

	}
}
