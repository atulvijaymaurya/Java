package day1;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		System.out.println(obj.getMessage());
	}
	
	String getMessage()
	{
		return "HelloWorld!";
	}
}
