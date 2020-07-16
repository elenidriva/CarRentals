package gr.codehub.rentals.io;

import gr.codehub.rentals.model.Car;

import java.util.List;

//abstract public class CarReader  // We force the kid-readers to inherit from CarReader. What if later
// on we want File reader to inherit from MicrosoftReader?
//{
//abstract public List<Car> readCars();
//
//}

public interface CarReader {
	public List<Car> readCars();
}
