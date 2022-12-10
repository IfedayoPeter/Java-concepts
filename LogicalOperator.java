package firstprogram;

public class LogicalOperator {
	public static void main(String[] args) {

		int value1 = 7;
		int value2 = 4;

		// && needs both conditions to be true in order to execute
		if ((value1 == value2) && (value2 > value1)) {
			// one condition is false and wont execute line 11
			System.out.println("payday");
		}

		if ((value1 > value2) && (value2 < value1)) {
			// both conditions are true and will execute line 16
			System.out.println("jackpot");
		}
		// || needs only one condition to be true in order to execute
		if ((value1 != value2) || (value1 > value2)) {
			// both conditions are true and will execute line 22
			System.out.println("faith");
		}

		if ((value1 < value2) || (value1 >= value2)) {
			// one condition is true and will execute line 27
			System.out.println("power");
		}

		if ((value1 < value2) || (value2 > value1)) {
			// none of the conditions are true and wont execute line 32
			System.out.println("deal");
		}
	}

}
