package Assignments;

public class Assignment3 {

	public void Addition (int a, int b)
	{
		int add = a+b;
		System.out.println("Addition is: " + add);
	}
	public int Substraction (int a, int b)
	{
		int minus = a-b;
		System.out.println("Substraction is: " + minus);
		return minus;
	}
	public int Division (int a, int b)
	{
		int divide = a/b;
		System.out.println("Division is: " + divide);
		return divide;
	}
	public int Multiplication (int a, int b)
	{
		int multiply = a*b;
		System.out.println("Multiplication is: " + multiply);
		return multiply;
	}
	public static void main(String[] args) {
		Assignment3 ob = new Assignment3();
		int divideResult = ob.Division(10, 2);
		int minusResult = ob.Substraction(divideResult, 2);
		int multiplyResult = ob.Multiplication(minusResult, 2);
		minusResult = ob.Substraction(multiplyResult, 2);
		ob.Addition(minusResult, 2);
	}


}
