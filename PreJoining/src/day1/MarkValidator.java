package day1;

public class MarkValidator {

	public static void main(String[] args) {
		MarkValidator obj = new MarkValidator();
		System.out.println("Grade for 79 marks is : " + obj.markGrade(79));
	}
	
	char markGrade(int mark)
	{
		if(isPass(mark))
		{
			if(mark > 90)
				return 'A';
			if(mark > 75)
				return 'B';
			if(mark > 60)
				return 'C';
			return 'D';
		}
		return 'F';
	}
	
	static boolean isPass(int mark)
	{
		return (mark >= 40) ? true : false;
	}
}
