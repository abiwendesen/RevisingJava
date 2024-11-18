import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IterativeGeen {

    public static String findGeen(String dna){
        int startIndex = dna.indexOf("ATG");
        int currIndex = dna.indexOf("TAA",startIndex+3);
      

        while (currIndex != -1){
            if((currIndex-startIndex) % 3 == 0){
                return dna.substring(startIndex,currIndex+3);

            }
            else {
                currIndex= dna.indexOf("TAA", currIndex+1);
            }
        }

        return "";
    }


    public static void main(String[] args){
            String s1 = "AATGCGTAATTAATCGATG";
            System.out.println("The Geen is "+findGeen(s1));
            System.out.println(s1.indexOf("ATG",5));
        }
    }

