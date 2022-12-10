package firstprogram;

public class NestedIfDemo {

	public static void main(String[] args) {

		int house = 50;
		int school = 30;

		if (house > school) {
			System.out.println("foootball");

			if (46 + 367 > house) {
				System.out.println("F1");

				if (school > house) {
					System.out.println("basketball");
				} else {
					System.out.println("hockey");

					if (school < house) {
						System.out.println("sports");
					}
				}
			}
		}

	}

}
