
package firstprogram;

public class ForLoopDemo {

	public static void main(String[] args) {

		for (int value = 1; value <= 10; value++) {
			System.out.println("increase value" + value);
		}

//	Enhanced ForLoop
		int[] count = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int v : count) {
			System.out.println(v);
		}

		char[] let = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (char vet : let) {
			System.out.println(vet);
		}
	}

}
