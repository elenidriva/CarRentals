package gr.codehub.rentals.model;

public class Car extends Vehicle
{
	public static Car parseLine(String line)
	{
		String[] items = line.split(",");
		return new Car(items[0], Integer.parseInt(items[1]));
	}

	public Car()
	{

	}
	public Car(String model, int value)
	{
		super(model, value, 4); // We do not want to repeat things that are the responsibility of i.e superclass
//		setModel(model); I just call the constructor of the parent class
//		setValue(value);
//		setWheelCount(4);
	}

	public String getSendLine()
	{
		return getModel() + "," + getValue();
	}
}
