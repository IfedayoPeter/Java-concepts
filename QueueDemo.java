package firstprogram;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] Args) {

		Queue<String> europe = new PriorityQueue<>();
//		queue operates a first in first out arrangement
		europe.add("germany");
		europe.add("spain");
		europe.add("england");
		europe.add("australia");

		System.out.println("queue: " + europe);

		europe.remove();
//		remove removes the element at the head but doesn't show the element that was removed
		System.out.println("queue: " + europe);

		String head = europe.peek();
//		peek only views the element at the head
		System.out.println("head: " + head);

		head = europe.poll();
//		poll removes the element at the head and shows he element that was removed 
		System.out.println("removed head: " + head);

		System.out.println("queue: " + europe);
	}

}
