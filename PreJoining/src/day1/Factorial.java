package day1;

public class Factorial {

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println("Factorial of 5 is: " + obj.calculateFactorial(5));
	}
	
	int calculateFactorial(int number)
	{
		if(number <= 1)
			return 1;
		return number * calculateFactorial(number - 1);
	}
}
