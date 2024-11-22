public class forTest {
    public static  String findGene(String dna, int where){
        int firstIndex = dna.indexOf("ATG", where);
       if(firstIndex == -1){
           return "";
       }


        int taaIndex = findStopCodon(dna, firstIndex, "TAA");
        int tagIndex = findStopCodon(dna, firstIndex, "TAG");
        int tgaIndex = findStopCodon(dna, firstIndex, "TGA");

        //int temp = Math.min(taaIndex, tagIndex);
        //int minIndex = Math.min(temp, tgaIndex);
        int minIndex = 0;
        if(taaIndex ==-1  || (tgaIndex !=-1 && tgaIndex<taaIndex)){
            minIndex = tgaIndex;
        }
        else {
            minIndex = taaIndex;
        }

        if(minIndex == -1 ||(tagIndex !=-1 && tagIndex<minIndex)){

           minIndex = tagIndex;
        }

        if(minIndex == -1){
        return "";

        }

        return dna.substring(firstIndex,minIndex+3);
    }
    public static void printAllGene(String dna){
        int startIndex = 0;
        while(true){

            String currGeen = findGene(dna,startIndex);
            if(currGeen.isEmpty()){
                break;
            }
            System.out.println("The Gene found: "+ currGeen);
            startIndex = dna.indexOf(currGeen,startIndex) + currGeen.length();

        }

    }
    public static int findStopCodon(String dna,int startIndex,String stopCodon){
        int currIndex = dna.indexOf(stopCodon,startIndex+3);
        while(currIndex != -1){
            if((currIndex-startIndex)%3 ==0){
                return currIndex;
            }
            else{

                currIndex = dna.indexOf(stopCodon,currIndex+1);
            }
        }
   return -1;
    }

    public static void main (String[] args){

       // String dna = "ATGACGCTAAGATAGTGATAG";
         String dna = "ATGATCTAATTTATGCTGCAACGGTGAAGA";
         printAllGene(dna);

    }
}
