package firstprogram;

import java.util.TreeMap;

public class TreMspDemo {

	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<>();

		map.put("a", 3);
		map.put("c", 1);
		map.put("b", 2);

		System.out.println(map);
		// a printout of element a, b, c is expected as
		// treemap naturally sorts elements regardless of the input order

		var exe = new TreeMap<>();

		exe.put(3, "b");
		exe.put(1, "c");
		exe.put(2, "a");

		System.out.println(exe);
//		a printout of element 1, 2, 3 is expected

		for (String out : map.keySet()) {
			System.out.println("key is " + out + " , value" + map.get(out));
		}

	}

}
