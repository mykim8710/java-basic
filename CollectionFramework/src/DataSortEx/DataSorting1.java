package DataSortEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable {
	int serial;
	String owner;

	public Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}

	@Override
	public int compareTo(Object o) {
		Computer c = (Computer) o;
		// return this.serial - c.serial; // serial 기준 오름차순
		// return c.serial - this.serial; // serial 기준 내림차순
		//return this.owner.compareTo(c.owner); // owner 기준 사전순
		 return c.owner.compareTo(this.owner); // owner 기준 사전반대순
	}

	public String toString() {
		return "PC serial : " + serial + ", PC owner : " + owner;
	}

}

public class DataSorting1 {
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<>();
		computers.add(new Computer(500, "kim"));
		computers.add(new Computer(200, "lee"));
		computers.add(new Computer(300, "park"));
		computers.add(new Computer(100, "jung"));
		System.out.println("= 정렬 전 =");
		Iterator<Computer> i = computers.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
		System.out.println();
		System.out.println("= 정렬 후 =");
		Collections.sort(computers);
		i = computers.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
}
