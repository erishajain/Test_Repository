package Assignments;

public class Assignment1 {

	int age, rollNo;
	public void display1() {
		System.out.println("Welcome to all of you!");
	}
	public void display2() {
		System.out.println("Automation is very easy.");
	}
	public static void main(String[] args) {
		Assignment1 ob = new Assignment1();
		ob.display1();
		ob.display2();
		ob.age = 27;
		ob.rollNo = 11;
		System.out.println("Age: " + ob.age);
		System.out.println("rollNo: " + ob.rollNo);


	}

}
