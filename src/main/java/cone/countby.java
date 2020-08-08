package cone;


public class countby {
    
    public static void count(int num){
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.println(j*i);
            }
        }
    }





    public static void main(String[] args) {
        int num = 5;
        count(num);

    }
}