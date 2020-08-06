package cone;

public class primenums { 

    public static void prime(int n) {
        int count, i;
        for (int j = 2; j < n; j++) {
            count = 0;
            for(i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.println(j);     
    }
    }        


        
    
    
public static void main(String[] args) {
    prime(50);
}


}

















