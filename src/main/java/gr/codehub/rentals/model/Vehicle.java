package gr.codehub.rentals.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle
{
	private String model;
	private int value;
	private int wheelCount;
}
