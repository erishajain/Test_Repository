package Assignments;

public class Assignment2 {
	
	public int Sum (int x, int y)// Addition method
	{
		int sumResult = x+y;
		System.out.println("Sum result " + sumResult);
		return sumResult; // returning the addition of two numbers
	}
	public int Multiply (int i, int j)// Multiplication method
	{
		int multiplyResult = i*j;
		System.out.println("Multiply result " + multiplyResult);
		return multiplyResult; // returning the multiplication of two numbers
	}
	public int Minus (int u, int v) // Subtraction method
	{
		int minusResult = u-v;
		System.out.println("Minus result " + minusResult);
		return minusResult; // returning the Subtraction of two numbers
	}
	public void Divide (int r, int s) // Division method
	{
		int divideResult = r/s;
		System.out.println("Divide result " + divideResult);
	}

	public static void main(String[] args) {
		Assignment2 a2 = new Assignment2(); // Object Creation
		int addition = a2.Sum(10, 2); // Calling addition method
		int multiplication = a2.Multiply(addition, 2); // Calling multiplication method
		int subtraction = a2.Minus(multiplication, 2); // Calling subtraction method
		multiplication = a2.Multiply(subtraction, 2); // Calling multiplication method
		a2.Divide(multiplication, 2); // Calling division method
		
	}
}






