public class cgRation {
    public static float CGratio(String dna){
        int cgCount = 0;
        for(int i=0; i<dna.length(); i++){
            char ch = dna.charAt(i);
            if(ch == 'C' ||  ch == 'G'){
                cgCount++;
            }
        }
        return (float) cgCount/dna.length();
    }
    public static void main(String[] args){
        String dna ="ATGCCATAG";
        System.out.println("CGratio is : "+ CGratio(dna));
    }
}
