package SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<String> setString = new TreeSet<>();
		setString.add("a");
		setString.add("x");
		setString.add("b");
		setString.add("z");
		setString.add("s");
		setString.add("c");

		System.out.println(setString);

		Set<Integer> setInt = new TreeSet<>();
		setInt.add(7);
		setInt.add(4);
		setInt.add(9);
		setInt.add(1);
		setInt.add(5);

		System.out.println(setInt);
	}
}
