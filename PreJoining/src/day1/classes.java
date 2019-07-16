package day1;

class student {
	public int rollNo;
	public String name;
	public String std;
	private String email;
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
}

class employee {
	public int id;
	public String name;
	public String department;
	private double salary;
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
}

class patient{
	public int id;
	public String name;
	private String disease;
	
	public void setDisease(String disease)
	{
		this.disease = disease;
	}
	
	public String getDisease()
	{
		return disease;
	}
}

public class classes {

	public static void main(String[] args) {
		student s1 = new student();
		s1.name = "Atul";
		s1.rollNo = 1;
		s1.std = "M.Sc. CS";
		s1.setEmail("atul@msc.com");
		
		student s2 = new student();
		s2.name = "Purush";
		s2.rollNo = 2;
		s2.std = "M.Sc. CS";
		s2.setEmail("purush@msc.com");
		
		employee e1 = new employee();
		e1.name = "Swapnil";
		e1.id = 1;
		e1.department = "Information Technology";
		e1.setSalary(1200000);
		
		employee e2 = new employee();
		e2.name = "Jayesh";
		e2.id = 2;
		e2.department = "Human Resource";
		e2.setSalary(1000000);
		
		patient p1 = new patient();
		p1.id = 1;
		p1.name = "Ishan";
		p1.setDisease("Fever");
		
		patient p2 = new patient();
		p2.id = 2;
		p2.name = "Mayank";
		p2.setDisease("Fracture");
		
		System.out.println("Students details are:");
		System.out.println(s1.rollNo + "\t" + s1.name + "\t" + s1.std + "\t" + s1.getEmail());
		System.out.println(s2.rollNo + "\t" + s2.name + "\t" + s2.std + "\t" + s2.getEmail());
		
		System.out.println("\nEmployee detailse are:");
		System.out.println(e1.id + "\t" + e1.name + "\t" + e1.department + "\t" + e1.getSalary());
		System.out.println(e2.id + "\t" + e2.name + "\t" + e2.department + "\t" + e2.getSalary());
		
		System.out.println("\nPatient details are:");
		System.out.println(p1.id + "\t" + p1.name + "\t" + p1.getDisease());
		System.out.println(p2.id + "\t" + p2.name + "\t" + p2.getDisease());
	}

}
