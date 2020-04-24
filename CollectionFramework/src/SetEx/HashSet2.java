package SetEx;

import java.util.Objects;

class Num {
	int n;
	String str;

	Num(int n, String str) {
		this.n = n;
		this.str = str;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Num)) {
			return false;
		} else {
			Num num = (Num) obj;
			return this.n == num.n && this.str == num.str;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(n, str);
	}
//
	@Override
	public String toString() {
		return n + " & " + str;
	}
}

public class HashSet2 {
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
//		set.add(1);
//		set.add(3);
//		set.add(6);
//		set.add(4);
//		set.add(2);
//		set.add(new Num(1, "one"));
//		set.add(new Num(1, "one"));

//		System.out.println(set);
//		for (int a : set) {
//			System.out.print(a + " ");
//		}

//		Iterator i = set.iterator();
//		while (i.hasNext()) {
//			System.out.print(i.next() + " ");
//		}

//		Set<String> set2 = new HashSet<>();
//		set2.add("Toy");
//		set2.add("Robot");
//		set2.add("Chicken");
//		set2.add("Banana");
//		System.out.println();
//		i = set2.iterator();
//		while (i.hasNext()) {
//			System.out.print(i.next() + " ");
//		}

		Num n1 = new Num(1, "one");
		Num n2 = new Num(1, "one");
		System.out.println(n1.equals(n2));
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
	}
}
