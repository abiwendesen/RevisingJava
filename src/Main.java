import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import edu.duke.*;

public class Main {
    public static String findGeen(String dna){
        //starting codon is always ATG and the end codon is TAA
         String result = "";
        int startingIndex = dna.indexOf("ATG");
        if(startingIndex== -1){
            return "";
        }
        int stopingIndex = dna.indexOf("TAA",startingIndex+3);
        if(stopingIndex== -1){

            return "";
        }
         result = dna.substring(startingIndex,stopingIndex+3);
         if(result.length()%3 == 0){
             return result;
         }
         else{
             return "The geen "+result+" is not valid";
         }
    }
    public static void main(String[] args) {
//        String s = "javaProgramming";
//        String sub = s.substring(4,14);
//        System.out.println(sub);
//       System.out.println(s.indexOf("Prog"));
//       System.out.println(s.indexOf("g",8));
//       System.out.println(s.startsWith("d"));
//       System.out.println(s.hashCode());
//   String geen = "ATTCGGATGACCTATTTAA";
//      System.out.println("DNA1 "+findGeen(geen));
//   String DNA = "AGATGCGATACFCTTAATC";
//      System.out.println(findGeen(DNA));
//      String DNA2 = "ATGGGTTAAGTC";
//      System.out.println("DNA2 "+findGeen(DNA2));
//      String DNA3 = "gatgctataat".toUpperCase();
//      System.out.println("DNA3 "+ findGeen(DNA3));

      DirectoryResource dr = new DirectoryResource();
      for (File f: dr.selectedFiles()){
          FileResource file = new FileResource(f);
          String s = file.asString();
          System.out.println("read " + s.length() + " characters");
          String result= findGeen(s);
          System.out.println("found " + result);

      }


    }
}