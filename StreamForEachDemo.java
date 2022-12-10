package firstprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForEachDemo {
	public static void main(String[] args) {

		List<String> language = new ArrayList<>();

		language.add("java");
		language.add("english");
		language.add("french");
		language.add("python");

		System.out.println("printing all elements one by one");
		language.stream().forEach(s -> System.out.println("elements= " + s));

//		using .sorted to sort elements in streams API
		List<String> sortedlist = language.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
	}
}
