package gr.codehub.rentals.io;

import gr.codehub.rentals.utility.DataNotSavedException;
import gr.codehub.rentals.utility.Logger;
import gr.codehub.rentals.model.Car;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CarWriter {

// In java we want to handle the problems (files, http requests) that we cannot predict (files, http requests)// not like the following code, because I (the programmer) needs to handle the problem??? dumb (the least I can do is the following)// I will let the business handle the situation instead. (We propagate the error upwards.)
//    public void sendToFile(List<Car> cars, String filename) {
//        Logger.log("Send cars to file");
//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter( new FileWriter( filename ) );
//            for (Car car : cars) {
//                pw.write( car.getSendLine() );
//                pw.write( "\n" );
//            }
//            pw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }



        public void sendToFile(List<Car> cars, String filename) throws DataNotSavedException {
        Logger.log("Send cars to file");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter( new FileWriter( filename ) );
            for (Car car : cars) {
                pw.write( car.getSendLine() );
                pw.write( "\n" );
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataNotSavedException();
        }

    }

//       public void sendToFile(List<Car> cars, String filename) throws Exception {
//           Logger.log( "Send cars to file" );
//           PrintWriter pw = null;
//           pw = new PrintWriter( new FileWriter( filename ) );
//           for (Car car : cars) {
//               pw.write( car.getSendLine() );
//               pw.write( "\n" );
//           pw.close();
//       }


    public void sendToPrinter(List<Car> cars) {
        Logger.log("Send cars to printer");
        for (Car car : cars) {
            Logger.log( car.getSendLine() );
        }
    }

}
