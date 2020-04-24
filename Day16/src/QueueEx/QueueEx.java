package QueueEx;

import java.util.*;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");

		System.out.println("next : " + que.peek());
		
		System.out.println("첫번째로 꺼내는 것 : " +que.poll());
		System.out.println("두번째로 꺼내는 것 : " +que.poll());
		
		System.out.println("next : " + que.peek());
		System.out.println("세번째로 꺼내는 것 : " +que.poll());

		System.out.println("que : " +que.poll());
		que.offer("Box");
		System.out.println("que : " +que.peek());
		
		
		System.out.println();
	}
}
