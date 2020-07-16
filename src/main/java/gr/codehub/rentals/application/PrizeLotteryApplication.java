package gr.codehub.rentals.application;

import gr.codehub.rentals.io.CarReader;
import gr.codehub.rentals.io.CarWriter;
import gr.codehub.rentals.utility.Logger;
import gr.codehub.rentals.model.Car;

import java.util.ArrayList;
import java.util.List;

public class PrizeLotteryApplication
{
//	private static void doLotteryBusiness()
//	{
//		CarReader carReader = new CarReader();
//		List<Car> prizes = carReader.readFromExcel();
//		List<Car> prizesWon = new ArrayList<>();
//		for (Car prize:prizes) {
//			if (Math.random() >= 0.5)
//				prizesWon.add(prize);
//		}
//		CarWriter carWriter = new CarWriter();
//		carWriter.sendToPrinter(prizesWon);
//	}

	public static void main(String[] args)
	{
		Logger.log("=== LOTTERY BUSINESS STARTED ====");
		//doLotteryBusiness();
		Logger.log("=== LOTTERY BUSINESS FINISHED ====");
	}

}
