package cone;

import java.util.ArrayList;

public class countby {
    
    public static void count(int num){
        
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
               System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        int num = 10;
        count(num);

    }
}