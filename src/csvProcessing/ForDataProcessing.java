package csvProcessing;
import java.util.Scanner;
import edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

public class ForDataProcessing {
    public static void processData(){
        Scanner input = new Scanner(System.in);
        FileResource file = new FileResource();
        CSVParser parser = file.getCSVParser();
        System.out.println("Please enter the date ");
        int date = input.nextInt();



    }
}
