package firstprogram;

public class TanaryOperatorsDemo {

	public static void main(String[] args) {

		int a = 4;
		int b = 6;
		int value;

		value = 2 + 2 == a ? b : a;
//value= if condition followed by ? for actual result if condition is true then : for else logic if condition is false
//Ternary operators can only hold one statement at a time
		System.out.println(value);
	}

}
