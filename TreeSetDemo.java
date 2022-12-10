package firstprogram;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] Args) {

		TreeSet<String> let = new TreeSet<String>();

		let.add("abdul");
		let.add("john");
		let.add("akin");
		let.add("chris");
		// treeset maintains a natural order of elements
		System.out.println(let);
		let.remove("akin");
		let.add("james");

		for (String value : let) {
			System.out.print(value + " ");
		}

	}

}
