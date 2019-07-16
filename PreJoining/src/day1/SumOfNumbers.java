package day1;

public class SumOfNumbers {

	public static void main(String[] args) {
		SumOfNumbers obj = new SumOfNumbers();
		System.out.println("Sum of odd numbers between 10 and 30 is: " + obj.sumOfOddNumbers(10,30));
		System.out.println("Sum of even numbers between 10 and 30 is: " + obj.sumOfEvenNumbers(10,30));
	}
	
	int sumOfEvenNumbers(int start, int end)
	{
		int sum = 0;
		for(int i = (start % 2 == 1) ? start+1 : start ; i <= end ; i += 2 )
			sum += i;
		return sum;
	}
	
	int sumOfOddNumbers(int start, int end)
	{
		int sum = 0;
		for(int i = (start % 2 == 0) ? start+1 : start ; i <= end ; i += 2 )
			sum += i;
		return sum;
	}
}
