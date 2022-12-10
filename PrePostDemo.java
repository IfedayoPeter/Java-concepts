package firstprogram;

public class PrePostDemo {

	public static void main(String[] Args) {

		int result = 4;
		result++;
		System.out.println(result);
		++result;
		System.out.println(result);
		System.out.println(result++);
		System.out.println(result);

		System.out.println(result--);
		System.out.println(result);
	}
}
