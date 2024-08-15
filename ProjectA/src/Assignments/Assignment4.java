package Assignments;

public class Assignment4 {

	public Assignment4() {
		this(55, 66, 77);
		System.out.println("Default Constructor");
	}
	public Assignment4(int a) {
		this();
		System.out.println("One Parameterized Constructor");
	}
	public Assignment4(int a, int b) {
		this(44);
		System.out.println("Two Parameterized Constructor");
	}
	public Assignment4(int a, int b, int c) {
		System.out.println("Three Parameterized Constructor");
	}
	public static void main(String[] args) {
		Assignment4 ob = new Assignment4(11, 22);
	}

}
