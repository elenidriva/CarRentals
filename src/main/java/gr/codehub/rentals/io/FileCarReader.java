package gr.codehub.rentals.io;

import gr.codehub.rentals.utility.Logger;
import gr.codehub.rentals.model.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCarReader implements CarReader {
    private String fileName;

    public FileCarReader(String fileName){
        this.fileName = fileName;
    }


    // We always close the files. By adding br.close() into try catch new exception will be generated and that's not optimal at all.
    // The files etc. that we want to close we will use it with resources (files and sockets). Java knows on its own that it will need to close it when needed
    // Be careful: if an exception occurs, the code will stop excuting and it will go to the catch lines, meaning that if we have br.close somewhere it will not close
    public List<Car> readCars(){
        Logger.log("Read from file");
        List<Car> cars = new ArrayList<>();
        BufferedReader br = null;
        try (br = new BufferedReader(new FileReader(fileName))){
            //br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                Car car = Car.parseLine(line);
                cars.add(car);
            } if (br != null) br.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Finally");

        }

        // Suboptimal solution as described above.
//            //br.close();
//        // Or else, catch ( NullPointerException e | IOException e ) and then add catch ( Exception e)
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            br.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            br.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            br.close();
//
//        }

        return cars;
    }

}
