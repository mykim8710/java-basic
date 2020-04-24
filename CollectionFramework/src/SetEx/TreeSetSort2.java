package SetEx;

import java.util.Collections;
import java.util.TreeSet;

class Color implements Comparable {
	String color;
	int num;

	public Color(String color, int num) {
		this.color = color;
		this.num = num;
	}

	@Override
	public int compareTo(Object o) {
		Color c = (Color) o;
		return this.color.toLowerCase().compareTo(c.color.toLowerCase());
		
	}

	@Override
	public String toString() {
		return color;
	}
}

public class TreeSetSort2 {
	public static void main(String[] args) {
		TreeSet<Color> set = new TreeSet<Color>();
		set.add(new Color("red", 1));
		set.add(new Color("Blue", 2));
		set.add(new Color("Pink", 3));
		set.add(new Color("magenta", 4));
		System.out.println(set);
		
		String a = "abC";
		
		
//		Collections.sort(set);

	}
}
