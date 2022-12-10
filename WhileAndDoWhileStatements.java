package firstprogram;

public class WhileAndDoWhileStatements {

	public static void main(String[] args) {

//		var name=4;
//		System.out.println(name);
//		name=7;
//		System.out.println(name);
//		
		int count = 1;

		while (count < 10) {
			// evaluation is done before int count is printed
			System.out.println("count is: " + count);
			count++;
		}

		int num = 6;
		// int num is printed before it is evaluated
		do {
			System.out.println(num);
			num++;
		} while (num < 10);
	}

}
