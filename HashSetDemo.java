package firstprogram;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] Args) {

		Set<String> let = new HashSet<>(7);

		let.add("g");
		let.add("s");
		let.add("n");
		let.add("c");
		// boolean r1= let.add("f");
		// System.out.println(r1);
		// boolean r2= let.add("f");
		// System.out.println(r2);
		System.out.println(let);

		System.out.println(let.contains("n"));

		for (String value : let) {
			System.out.print(value + " ");
		}

	}

}
