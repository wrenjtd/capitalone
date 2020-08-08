package cone;

public class primenums { 

    public static void prime(int n){
        int count, i;

        /**Prime numbers start at 2 and are only divisble by 1 and themselves */
        for (int j = 2; j < n; j++){
            //Always start count at 0. This keeps track of how many things j is divisible by
            count = 0;
            //Loop through numbers from 1 to j
            for(i = 1; i <= (int)Math.sqrt(n); i++){
                //If i divides nicely into j add to count
                if(j%i == 0){
	            count++;        
	            }
            }
            //Prime numbers can only have a count of two ie, divisible by 1 and itself only
	        if(count==2){
            System.out.println(j);  
            }   
        }
    }        


        
    
    
public static void main(String[] args) {
    prime(50);
    
}


}

















