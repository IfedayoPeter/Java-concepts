package firstprogram;

public class IfElseIfDemo {

	public static void main(String[] args) {

		int score = 57;
		char grade;

		if (score >= 90) {
			grade = 'A';

		} else {
			grade = 'F';
		}
		System.out.println("Grade= " + grade);

		int testscore = 88;
		char maths;

		if (testscore >= 90) {
			maths = 'A';
		} else if (testscore >= 70) {
			maths = 'B';
		} else if (testscore >= 60) {
			maths = 'C';
		} else if (testscore >= 45) {
			maths = 'D';
		} else {
			maths = 'F';
		}
		System.out.println("Maths= " + maths);
	}

}
