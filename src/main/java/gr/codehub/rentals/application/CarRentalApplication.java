package gr.codehub.rentals.application;

import gr.codehub.rentals.business.CarChooser;
import gr.codehub.rentals.io.CarReader;
import gr.codehub.rentals.io.CarWriter;
import gr.codehub.rentals.io.ExcelCarReader;
import gr.codehub.rentals.io.FileCarReader;
import gr.codehub.rentals.utility.DataNotSavedException;
import gr.codehub.rentals.utility.Logger;
import gr.codehub.rentals.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalApplication
{
	private static void doRentalBusiness()
	{
		// Compare this to the previous version. I will only need to test CarChooser and businessChoice
		// the following line will be automatically checked in CarChooser and we are good to go
		// Design by contract: idc how you do it, I want it & I won't tell you what I've done, it works.

		CarReader carReader = CarChooser.getBusinessChoice();

		List<Car> cars = new ArrayList<Car>();
		List<Car> userCars = new ArrayList<Car>();
		//Vehicle bicycle = new Vehicle("my bike", 70, 2);
		// ERROR, because cunstructors are not inherited!
		 //Car car = new Car("Fiat", 2000);

		//CarReader carReader = new FileCarReader();
		// CarReader carReader = new CarReader(); // I want seperate reader for each function
		//S EurobankConn ebc = new EurobankConn(); The reference forces me to handle all this has to do with
		//S Eurobank. Instead, it's better to write: BankConn ebc = new EurobankConn(); Here it's optimal
		//S to add another class that's going to choose which one to use. Therefore,
		//S BankConn bc = BankChooser.getCorrectBankConnector
		// List<Car> cars;
		// double userChoice = Math.random();
		// This is mixed logic
		// If I want to add another means to read, I will need to modify this file. And that's wrong.
//		if (userChoice >= 0.5)
//			carReader = new ExcelCarReader();
//		else
//			carReader = new FileCarReader();

		//List<Car> userCars = new ArrayList<Car>();
		userCars.add(cars.get(0));
		userCars.add(cars.get(1));
		CarWriter carWriter = new CarWriter();
		double systemChoice = Math.random();
		if (systemChoice >= 0.5)
			carWriter.sendToPrinter(userCars);
		else {
			try {
				carWriter.sendToFile(userCars, "chosenCars.txt");
			} catch (DataNotSavedException e) {
				e.printStackTrace();
				// we added something here, i can't recall
			}
		}
	}

	public static void main(String[] args){
		Logger.log("=== RENTAL BUSINESS STARTED ====");
		doRentalBusiness();
		Logger.log("=== RENTAL BUSINESS FINISHED ====");
	}

}
