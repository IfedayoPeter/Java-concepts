package firstprogram;

public class ArithmeticDemo {

	public static void main(String[] args) {

		int result = 2 + 2;
		System.out.println("2+2= " + result);

		int original_result = result;
		result = result - 1;
		System.out.println(original_result + "-1= " + result);

		original_result = result;
		result = result * 2;
		System.out.println(original_result + "*3= " + result);

		original_result = result;
		result = result / 2;
		System.out.println(original_result + "/2= " + result);

		original_result = result;
		result = result * 4;
		System.out.println(original_result + "*4= " + result);

		original_result = result;
		result = result % 5;
		System.out.println(original_result + "%5= " + result);

		int answer = 50 + 30;
		System.out.println("50+30- " + answer);

		int real_answer = answer;
		answer = answer - 26;
		System.out.println(real_answer + "-26= " + answer);

		real_answer = answer;
		answer = answer * 2 / 10 + 34;
		System.out.println(real_answer + "*2/10+34= " + answer);

		real_answer = answer;
		answer = answer % 5;
		System.out.println(real_answer + "%5= " + answer);

		int pro = 2 * 2;
		System.out.println("2*2= " + pro);

		int real_pro = pro;
		pro = pro * 4 / 2;
		System.out.println(real_pro + "*4/2= " + pro);

		real_pro = pro;
		pro = pro % 4;
		System.out.println(real_pro + "%4= " + pro);

	}

}
