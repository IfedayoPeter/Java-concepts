package firstprogram;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] Args) {

		LinkedList<String> names = new LinkedList<>();
		// adds elements to the list
		names.add("john");
		names.add("james");
		// System.out.println(names);
		// adds element to the end of the list
		names.addLast("paul");
		// System.out.println(names);
		// adds element to the beginning of the list
		names.addFirst("sam");
		// System.out.println(names);
		// adds element to index 2 of the list
		names.add(2, "michael");
		System.out.println(names);

		names.remove("john");
		System.out.println(names);
		names.remove(2);
		System.out.println(names);
		names.removeFirst();
		System.out.println(names);
		names.removeLast();
		System.out.println(names);

	}

}
