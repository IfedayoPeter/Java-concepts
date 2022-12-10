package firstprogram;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] Args) {

		List<Integer> value = new ArrayList<>(5);

		for (int i = 1; i <= 5; i++)
//		adds value of int i to arraylist
			value.add(i);

		System.out.println(value);
		value.remove(3);
//		removes value at index 3
		System.out.println(value);

//		for(int y=0; y<value.size(); y++) {
//			System.out.print(value.get(y)+ " ");

//		}
		for (int y : value) {
			System.out.print(y + " ");
		}

	}

}
