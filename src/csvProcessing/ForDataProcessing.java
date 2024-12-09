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
        int dateFromCSV;
        System.out.println("Please enter the date ");
        int date = input.nextInt();
        for(CSVRecord record : parser){
          dateFromCSV = Integer.parseInt(record.get("Year"));
          if(dateFromCSV > date){
              System.out.println(record.get("Computer Science"));
          }
        }
    }
    public static void main(String[] arg){
        processData();
    }
}
