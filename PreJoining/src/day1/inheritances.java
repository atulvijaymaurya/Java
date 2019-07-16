package day1;

class Vehicle
{
	String brand;
	
	public void printBrand()
	{
		System.out.println(brand);
	}
}

class Car extends Vehicle
{
	String modelName;
	
	public void printModel()
	{
		System.out.println(modelName);
	}
}

class Bus extends Vehicle
{
	String modelName;
	int seatingCapacity;
	
	public void printSeating()
	{
		System.out.println(seatingCapacity);
	}
}

public class inheritances {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Maruti";
		car1.modelName ="800";
		car1.printBrand();
		car1.printModel();
		
		Bus bus1 = new Bus();
		bus1.brand = "TATA";
		bus1.modelName = "XYZ";
		bus1.seatingCapacity = 48;
		bus1.printBrand();
		System.out.println(bus1.modelName);
		bus1.printSeating();
	}
}
