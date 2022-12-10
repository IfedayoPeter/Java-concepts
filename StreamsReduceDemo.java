package firstprogram;

import java.util.ArrayList;
import java.util.List;

public class StreamsReduceDemo {
	public static void main(String[] args) {

		List<Integer> value = new ArrayList<>();
		value.add(10);
		value.add(20);
		value.add(30);
		value.add(40);

		int sum = value.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
//	streams reduce functionality is required when calculating the sum of all the elements inside a collection
//	i.e whenever the representation of a complete collection is to be changed to a single result

//	Identity- an element that is the initial value of the reduction operation
//	and the default of the stream is empty

//	Accumulator- a function that takes two parameters;
//	a partial result of the reduction

//	Combiner- a function used to combine the partial result of the reduction operation
//	when the reduction is parallelized, or when there is a mismatch between the types of accumulator
//	arguments and types of the accumulator implementation
}
