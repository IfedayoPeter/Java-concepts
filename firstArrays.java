package firstprogram;

public class firstArrays {

	public static void main(String args[]) {
		// declares an array of integers
		int[] anArray;

		// allocates memory for 10 integers
		anArray = new int[10];

		// Initialise first element
		anArray[0] = 100;
		// initialise second element
		anArray[1] = 200;
		// and so froth
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;

		System.out.println("Element at index o:" + anArray[0]);
		System.out.println("Element at index 1:" + anArray[1]);
		System.out.println("Element at index 2:" + anArray[2]);
		System.out.println("Element at index 3:" + anArray[3]);
		System.out.println("Element at index 4:" + anArray[4]);
		System.out.println("Element at index 5:" + anArray[5]);
		System.out.println("Element at index 6:" + anArray[6]);
		System.out.println("Element at index 7:" + anArray[7]);
		System.out.println("Element at index 8:" + anArray[8]);
		System.out.println("Element at index 9:" + anArray[9]);

		int[] schools;
		schools = new int[5];

		schools[0] = 150;
		schools[1] = 300;
		schools[2] = 100;
		schools[3] = 526;
		schools[4] = 256;

		System.out.println("Greenland hall:" + schools[0]);
		System.out.println("Greeen springs:" + schools[1]);
		System.out.println("Logic:" + schools[2]);
		System.out.println("Ambassadors:" + schools[3]);
		System.out.println("Good sepherd:" + schools[4]);

		String[] Name;
		Name = new String[3];

		Name[0] = "Shola";
		Name[1] = "John";
		Name[2] = "Ife";

		System.out.println("My name is " + Name[0]);
		System.out.println("I was at school with " + Name[1] + " yesterday");
		System.out.println(Name[0] + "and " + Name[2] + "are going to the market");

		String[] statement;
		statement = new String[2];

		statement[0] = "I support chelsea football club";
		statement[1] = "We alone can shape our future";

		System.out.println(statement[0]);
		System.out.println(statement[1]);

		char[] letter;
		letter = new char[4];

		letter[0] = 'a';
		letter[1] = 'h';
		letter[2] = 'g';
		letter[3] = 'y';

		System.out.println(letter[0] + " for andriod");
		System.out.println(letter[1] + " for halo");
		System.out.println(letter[2] + " for goat");
		System.out.println(letter[3] + " for yatch");

		boolean[] question;
		question = new boolean[2];

		question[0] = false;
		question[1] = true;

		System.out.println("Is blue an object? Ans= " + question[0]);
		System.out.println("Yellow is not an object. This statement is " + question[1]);

	}
}
