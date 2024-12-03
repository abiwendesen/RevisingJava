package csvProcessing;
import  edu.duke.FileResource;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
public class CSVExample {
    public static void realFood(){
        try {
            FileResource fr = new FileResource();
            CSVParser csv = fr.getCSVParser();
            System.out.print("Name" + "\t");
            System.out.print("Favorite Color" + "\t");
            System.out.println("Favorite Food " + "\t");
            for (CSVRecord record : csv) {
                System.out.print(record.get("Name") + "\t");
                System.out.print("\t");
                System.out.print(record.get("Favorite Color") + "\t");
                System.out.println(record.get("Favorite Food"));
            }
        }
        catch(Exception e){
           System.out.println(e) ;
        }
    }
    public static void main(String[] args){
        realFood();
    }
}
