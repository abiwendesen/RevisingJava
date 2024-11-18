public class part2 {
    public static int howMany(String a, String b){
     int firstOcc = b.indexOf(a);
     if(firstOcc ==-1){
         return 0;
     }
     int count = 0;
     int currIndex = 0;
     while(currIndex != -1){
       currIndex = b.indexOf(a,firstOcc+a.length());

       count++;

      firstOcc = b.indexOf(a,currIndex);
     }
     return count;
    }
    public static void main(String[] args){
        String a = "AA";
        String b = "ATAAAATAA";
        System.out.println(howMany(a,b));
    }
}
