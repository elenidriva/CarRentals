package gr.codehub.rentals.io;

import gr.codehub.rentals.model.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class HouseReader
{
	public List<House> readFromFile(String filename){
		List<House> houses = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filename));
			String line;
			while((line = br.readLine())!=null) {
				House house = House.parseLine( line );
				houses.add( house );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return houses;
	}

	public List<House> readFromExcel(){
		List<String> excelLines = new ArrayList<>();
		excelLines.add("Athinas 21,15000");
		excelLines.add("Irinis 22,48000");
		excelLines.add("Naxou 23,63000");
		excelLines.add("Alexandras 24,76000");
		List<House> houses = new ArrayList<>();
		for(String line:excelLines) {
			House house = House.parseLine(line);
			houses.add(house);
		}
		return houses;
	}
}