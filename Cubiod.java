package firstprogram;

public class Cubiod {
//	Multiple constructors demo

	int width;
	int height;
	int depth;

	public Cubiod(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public Cubiod(int width, int depth) {
		this.width = width;
		this.height = 10;
		this.depth = depth;
	}

	public Cubiod(int dimension) {
		this.width = dimension;
		this.height = dimension;
		this.depth = dimension;
	}

	public Cubiod() {
		this.width = 3;
		this.height = 24;
		this.depth = 12;
	}

	int volume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		int volume;

		Cubiod one = new Cubiod(21, 4, 32);
		volume = one.volume();
		System.out.println(volume);

		Cubiod two = new Cubiod(5, 5);
		volume = two.volume();
		System.out.println(volume);

		Cubiod three = new Cubiod(5);
		volume = three.volume();
		System.out.println(volume);

		Cubiod four = new Cubiod();
		volume = four.volume();
		System.out.println(volume);
	}

}
