package StackEx;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackEx {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		stack.offerFirst("1. Box");
		stack.offerLast("0. Apple");
//		stack.offerFirst("2. Toy");
//		stack.offerFirst("3. Robot");
		
		System.out.println(stack.pollFirst());
		System.out.println(stack.pollLast());
	}
}
