package csvProcessing;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.util.Scanner;

public class countryData {
    public  static void CountryInfo(CSVParser parser, String country ){
            boolean breaker = false;
            for (CSVRecord record : parser) {
                if (record.get("Country").contains(country)) {
                    System.out.print(record.get("Country") + " : ");
                    System.out.print(record.get("Exports") + ": ");
                    System.out.println(record.get("Value (dollars)"));
                    breaker = true;
                }

            }
            if(!breaker){
                System.out.println("NOT FOUND");
            }

    }

    public static void testCountryInfo(){
        Scanner input = new Scanner(System.in);
        FileResource file = new FileResource();
        CSVParser parser = file.getCSVParser();
        System.out.println("Please enter the country you want to search");
        String country = input.next();
        CountryInfo(parser,country);
    }

    public static void main(String[] args){
        testCountryInfo();
    }
}
