package cone;

public class coins {
    
    public static void produceChange(double payment){
        payment = payment * 100;
        int paymentInt = (int)payment;
        System.out.println(paymentInt);
        int numQuarters = Math.floorDiv(paymentInt, 25);
        paymentInt -= numQuarters * 25;
        System.out.println(paymentInt);
        int numDimes = Math.floorDiv(paymentInt, 10);
        paymentInt -= numDimes *10;
        int numNickles = Math.floorDiv(paymentInt, 5);
        paymentInt -= numNickles * 5;
        int numPennies = Math.floorDiv(paymentInt, 1);
        paymentInt -= numPennies * 1;
        System.out.println("Your change! \nQuarters: "+numQuarters
        +"\nDimes: " + numDimes
        +"\nNickles: " + numNickles
        +"\nPennies: " + numPennies);
        
    }


    public static void main(String[] args) {
        
        double payment = 50.00;
        produceChange(payment);
    }
}