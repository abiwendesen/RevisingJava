package csvProcessing;
import  edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
public class CSVExample {
    public static void realFood(){
        FileResource fr = new FileResource();
        CSVParser csv = fr.getCSVParser();
        for(CSVRecord record:csv){
            System.out.print(record.get("Name")+"\t");
            System.out.print(record.get("Favorite Color")+"\t");
            System.out.println(record.get("Favorite Food"));
        }
    }
    public static void main(String[] args){
        realFood();
    }
}
