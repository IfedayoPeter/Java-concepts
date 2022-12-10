package firstprogram;

public class Student {
//	a class is the blue print of an object
//	an object is the instance of a class

//	an object has attributes and behaviours which should always be identified
	String name;
	int age;
	String address;
	String hobby;

	public Student(String name, int age, String address, String hobby) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.hobby = hobby;
	}

//	setters and getters are used to identify the behaviour of an object
	public void setname(String name) {
		this.name = name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public void sethobby(String hobby) {
		this.hobby = hobby;
	}

	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}

	public String getaddress() {
		return address;
	}

	public String gethobby() {
		return hobby;
	}

	public static void main(String[] args) {

		Student ss1 = new Student("John ", 13, "45, ojuelegba street, ", "football");
		System.out.println(ss1.getname());
		System.out.println(ss1.getage());
		System.out.println(ss1.getaddress());
		System.out.println(ss1.gethobby());
	}

}
