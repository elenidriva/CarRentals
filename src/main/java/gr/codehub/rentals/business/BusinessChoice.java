package gr.codehub.rentals.business;

import gr.codehub.rentals.io.CarReader;
import gr.codehub.rentals.io.ExcelCarReader;
import gr.codehub.rentals.io.FileCarReader;

public class BusinessChoice {

    public static boolean canUseExcel(){
        double userChoice = Math.random();
        return userChoice > 0.5;

    }

}
