package day1;

public class MarkValidatorSwitch {

	public static void main(String[] args) {
		MarkValidatorSwitch obj = new MarkValidatorSwitch();
		System.out.println("Grade for 79 marks is : " + obj.markGrade(79));
	}
	
	char markGrade(int mark)
	{
		if(isPass(mark))
		{
			switch(mark)
			{
				case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93:
				case 92: case 91:
					return 'A';
				case 90: case 89: case 88: case 87: case 86: case 85: case 84: case 83:
				case 82: case 81: case 80: case 79: case 78: case 77: case 76:
					return 'B';
				case 75: case 74: case 73: case 72: case 71: case 70: case 69: case 68:
				case 67: case 66: case 65: case 64: case 63: case 62: case 61:
					return 'C';
				default:
					return 'D';
			}
		}
		return 'F';
	}
	
	static boolean isPass(int mark)
	{
		return (mark >= 40) ? true : false;
	}
}
