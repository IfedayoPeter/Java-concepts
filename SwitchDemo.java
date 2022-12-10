package firstprogram;

public class SwitchDemo {

	public static void main(String[] args) {

		int month = 11;
		// month is assigned a string name
		String monthstring;

		switch (month) {
		// the value of month is assigned to case
		case 1:
			monthstring = "January";
			break;
		case 2:
			monthstring = "February";
			break;
		case 3:
			monthstring = "march";
			break;
		case 4:
			monthstring = "April";
			break;
		case 5:
			monthstring = "may";
			break;
		case 6:
			monthstring = "June";
			break;
		case 7:
			monthstring = "July";
			break;
		case 8:
			monthstring = "August";
			break;
		case 9:
			monthstring = "Septembr";
			break;
		case 10:
			monthstring = "October";
			break;
		case 11:
			monthstring = "November";
			break;
		case 12:
			monthstring = "December";
			break;
		// when the values of month is not in any of the cases, system prints out
		// default
		default:
			monthstring = "invaid month";
		}
		System.out.println(monthstring);

		int age = 16;
		String grade;

		switch (age) {
		case 10:
			grade = "jss1";
			break;
		case 11:
			grade = "jss2";
			break;
		case 12:
			grade = "jss3";
			break;
		case 13:
			grade = "ss1";
			break;
		case 14:
			grade = "ss2";
			break;
		case 15:
			grade = "ss3";
			break;
		default:
			grade = "A Level";
			break;
		}
		System.out.println(grade);
	}

}
