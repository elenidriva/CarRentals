package gr.codehub.rentals.model;

public class House
{
	private String address;
	private int value;

	public static House parseLine(String line)
	{
		String[] items = line.split(",");
		return new House(items[0], Integer.parseInt(items[1]));
	}

	public House(String address, int value)
	{
		this.address = address;
		this.value = value;
	}

	public String getSendLine()
	{
		return address + "," + value;
	}

}
