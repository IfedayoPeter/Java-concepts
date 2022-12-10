package firstprogram;

public class NestedForLoop {

	public static void main(String[] args) {

		int value[][] = { { 3, 6, 3, 5 }, { 8, 4, 7, 9 }, { 1, 2, 8, 4 } };

		for (int w = 0; w < 3; w++) {
			for (int f = 0; f < 4; f++) {
				System.out.print(value[w][f] + "");
			}
			System.out.println();
		}
	}

}
