package day1;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("30 celsius in farenheit is: " + convertToFarenheit(30));
		System.out.println("100 farenheit in celsius is: " + convertToCelsius(100));
	}
	
	static double convertToFarenheit(double celsius)
	{
		return celsius * 9 / 5 + 32;
	}
	
	static double convertToCelsius (double farenheit)
	{
		return (farenheit - 32) * 5 / 9;
	}
}
