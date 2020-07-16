package gr.codehub.rentals.io;

import gr.codehub.rentals.utility.Logger;
import gr.codehub.rentals.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ExcelCarReader implements CarReader {

    public List<Car> readCars(){
        Logger.log("Read from Excel");
        List<String> excelLines = new ArrayList<>();
        excelLines.add("Ford Focus,19000");
        excelLines.add("Seat Ibiza,12000");
        excelLines.add("Fiat Punto,13000");
        excelLines.add("BMW M5,82000");
        List<Car> cars = new ArrayList<>();
        for(String line:excelLines) {
            Car car = Car.parseLine(line);
            cars.add(car);
        }
        return cars;
    }

}
