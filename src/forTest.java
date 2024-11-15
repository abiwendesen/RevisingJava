public class forTest {
    public static  String findGeen(String dna){
        int firstIndex = dna.indexOf("ATG");
       if(firstIndex == -1){
           return "";
       }


        return "";
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
   return dna.length();
    }

    public static void main (String[] args){

        String dna = "ATGACGCTAAGATAA";
        System.out.println(findGeen(dna));
    }
}
