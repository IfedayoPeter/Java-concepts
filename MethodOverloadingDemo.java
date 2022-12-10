package firstprogram;

public class MethodOverloadingDemo {

	public int multiply(int x, int y) {
		return (x * y);
	}

	public int multiply(int x, int y, int z) {
		return (x * y * z);
	}

	public double multiply(double x, double y) {
		return (x * y);
	}

	public static void main(String[] args) {
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		System.out.println(demo.multiply(34, 40, 12));
		System.out.println(demo.multiply(41.3, 6.4));
		System.out.println(demo.multiply(5, 10));

	}

}
