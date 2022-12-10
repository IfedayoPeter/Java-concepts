package firstprogram;

public class TwoDarrayDemo {

	public static void main(String[] args) {

//		int[][] A= {{3,5,44},{3,8,77}};
//		System.out.println(A[1][2]);
//		System.out.println(A[0][2]);
//		System.out.println(A[0][0]);
//		System.out.println(A[1][0]);
//		System.out.println(A[1][1]);

		int[][][] B = { { { 5, 3, 8 }, { 4, 7, 9 } }, { { 1, 0, 6 }, { 2, 45, 99 } } };

		System.out.println(B[0][1][2]);
		System.out.println(B[1][1][2]);
		System.out.println(B[1][0][2]);
		System.out.println(B[1][1][0]);
		System.out.println(B[0][1][0]);

	}

}
