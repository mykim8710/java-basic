package ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	public static long addTimeInOrder(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long addTimeInTheMiddle(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.add(500, "x");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long removeTimeInTheMiddle(List list) {
		long start = System.currentTimeMillis();
		for (int i = 1000; i < 10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long removeTimeInOrder(List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(2000000);
		LinkedList<String> ll = new LinkedList<>();

		System.out.println("==순차적으로 추가하기==");
		System.out.println("ArrayList : " + addTimeInOrder(al) / 1000.0 + "초"); // 0.14초
		System.out.println("LinkedList : " + addTimeInOrder(ll) / 1000.0 + "초"); // 1.937초

		System.out.println();
		System.out.println("==중간에 추가하기==");
		System.out.println("ArrayList : " + addTimeInTheMiddle(al) / 1000.0 + "초"); // 1.509초
		System.out.println("LinkedList : " + addTimeInTheMiddle(ll) / 1000.0 + "초"); // 0.012초

		System.out.println();
		System.out.println("==중간에 삭제하기==");
		System.out.println("ArrayList : " + removeTimeInTheMiddle(al) / 1000.0 + "초"); // 1.313초
		System.out.println("LinkedList : " + removeTimeInTheMiddle(ll) / 1000.0 + "초"); // 0.132초

		System.out.println();
		System.out.println("==순차적으로 삭제하기==");
		System.out.println("ArrayList : " + removeTimeInOrder(al) / 1000.0 + "초"); // 0.0초
		System.out.println("LinkedList : " + removeTimeInOrder(ll) / 1000.0 + "초"); // 0.016초
	}
}
