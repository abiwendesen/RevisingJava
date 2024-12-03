package csvProcessing;
import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.util.Scanner;

import java.io.File;

public class whichCountriesExport {
    public static void listExporters(CSVParser parser, String exportOfInterest){
        for(CSVRecord record: parser){
            if(record.get("Exports").contains(exportOfInterest)){
                System.out.println(record.get("Country"));
            }
        }

    }
    public static void main(String[] args){
        try{
        FileResource file = new FileResource();
        CSVParser csv = file.getCSVParser();
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert The item you want to search");
        String exportOfInterest = input.nextLine();
        listExporters(csv,exportOfInterest);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
