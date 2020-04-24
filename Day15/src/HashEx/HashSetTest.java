package HashEx;

import java.util.HashSet;

class Num {
	private int num;

	public Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		return num % 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Num)) {
			return false;
		} else {
			Num n = (Num) obj;
			return this.num == n.num;
		}
	}

}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<Num>();

		set.add(new Num(7799));
		set.add(new Num(8789));
		set.add(new Num(7799));
		set.add(new Num(8789));
		set.add(new Num(5678));
		set.add(new Num(5678));

		System.out.println(set.size());
		System.out.println(set);

	}
}
