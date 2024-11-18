import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class forEachTimeMeasurment {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;

        for(int i=0; i<1000000; i++)
            list.add(i);



        //type one
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int x :list) {
            int a = x;
        }
       endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For each loop ::" +(endTime-startTime)+"ms");

        // Type 2
   startTime= Calendar.getInstance().getTimeInMillis();

        for(int i=0; i<list.size(); i++){
            int a= list.get(i);
        }
        endTime= Calendar.getInstance().getTimeInMillis();
        System.out.println("For Loop:: " +(endTime-startTime)+" ms");

        //type 3
        startTime=Calendar.getInstance().getTimeInMillis();
        int size= list.size();
        int B= 0;
        for(int j=0; j<size; j++){
            B= list.get(j);
        }

        endTime= Calendar.getInstance().getTimeInMillis();
        System.out.println("By calculating Collection.size :: " +(endTime-startTime)+" ms");
    }
}
