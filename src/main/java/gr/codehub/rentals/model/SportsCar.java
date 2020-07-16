package gr.codehub.rentals.model;

import gr.codehub.rentals.model.Car;
import lombok.Data;

@Data
public class SportsCar extends Car
{
	private int topSpeed;
	
	public SportsCar(String model, int value, int topSpeed)
	{
		super(model, value);
		this.topSpeed = topSpeed;
	}

}
