package cone;

import java.util.ArrayList;
import java.util.List;

public class multiples {
    
    public static void getmultiples(int multiplesOf){
        ArrayList<Integer> iList = new ArrayList<>();
        
        for (int i = 1; i <= multiplesOf; i++) {
            if(multiplesOf % i == 0){
                iList.add(i);
            }
        }

        for (int value : iList) {
            System.out.println(value);
        }

       
         
    }

    public static void main(String[] args) {
        
        int multiplesOf = 100;
        getmultiples(multiplesOf);
       


    }
}