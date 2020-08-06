package cone;

public class nthfib {
    

    public static void nthfib(int num){
        if(num ==0) System.out.println(0);
        int a =0;
        int b =1;

        for(int i = 2; i<num; i++){
            int c = a+b;
            a=b;
            b=c;
        }
        System.out.println(a+b);
    }



    public static void main(String[] args) {
        int num = 3;
        nthfib(num);
    }
}