package gr.codehub.rentals.business;

import gr.codehub.rentals.io.CarReader;
import gr.codehub.rentals.io.ExcelCarReader;
import gr.codehub.rentals.io.FileCarReader;
import gr.codehub.rentals.model.Car;

import java.util.List;

public class CarChooser { // connect Logic with Business


    public static CarReader getBusinessChoice(){ // not public, i will remove public so that it can only be seen within the package
        CarReader carReader;
        boolean useExcel = BusinessChoice.canUseExcel();
        if (useExcel){
            carReader = new ExcelCarReader(); // these are the only lines that connect the "abstract" part with the impl
        } else {
            carReader = new FileCarReader("availableCars.txt");
        }
        return carReader;
    }


    // Isntead of this, write the code above. We do not want to choose here. it does 2 things.
//    public static CarReader getBusinessChoice(){
//
//        CarReader carReader;
//        double userChoice = Math.random();
//        if (userChoice >= 0.5)
//            carReader = new ExcelCarReader();
//        else
//            carReader = new FileCarReader("availableCars.txt");
//        return carReader;
//    }
}
