package firstprogram;

public class ArrayPractice {
	public static void main(String practice[]) {

		// declares an array of string
		String[] countries;
		// allocates memory for 2 Strings
		countries = new String[2];
		countries[0] = "france";
		countries[1] = "germany";

		// declares an array of boolean
		boolean[] question;
		// allocates memory for 2 booleans
		question = new boolean[2];
		question[0] = false;
		question[1] = true;

		// declares an array of char
		char[] alphabeth;
		// allocates memory for char
		alphabeth = new char[2];
		alphabeth[0] = 'w';
		alphabeth[1] = 'h';

		// declares an array of byte
		byte[] number;
		// allocates memory for byte
		number = new byte[2];
		number[0] = 46;
		number[1] = 127;

		System.out.println(countries[0]);
		System.out.println(countries[1]);

		System.out.println(question[0]);
		System.out.println(question[1]);

		System.out.println(alphabeth[0]);
		System.out.println(alphabeth[1]);

		System.out.println(number[0]);
		System.out.println(number[1]);

	}

}
