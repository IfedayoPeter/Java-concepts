package firstprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] Args) {

		Map<String, Integer> names = new HashMap<>();

		names.put("shola", 74);
		names.put("james", 54);
		names.put("taiwo", 35);
		names.put("chris", 57);

		System.out.println("size of map " + names.size());
		// name.size would get the size of the map

		System.out.println(names);

		if (names.containsKey("taiwo")) {
			int T = names.get("taiwo");
			System.out.println("value for taiwo is: " + T);
			// the value for taiwo should be printed out
		}

		for (String staff : names.keySet()) {
			System.out.println("staff: " + staff + " is age " + names.get(staff));
		}
		for (Entry<String, Integer> entry : names.entrySet()) {
			System.out.println("key" + entry.getKey() + ", value:" + entry.getValue());

		}
	}

}
