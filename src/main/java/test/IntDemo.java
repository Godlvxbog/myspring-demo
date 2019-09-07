package test;

public class IntDemo {

    public static void main(String[] args) {
        double amount =0.00;
        double serviceAmount =0.00;
        double fee= 0.00;
        double newTotalAmount = 0.00;
        int count =0;
        while (true){
            amount+=0.01;

            amount = formatDouble1(amount);

            serviceAmount =formatDouble1(amount/1.001)  ;

            fee =0.001 * serviceAmount;

            fee = formatDouble1(fee);

            newTotalAmount = formatDouble1(fee + serviceAmount);

            if (newTotalAmount >amount){
                System.out.println("fee= " +fee +"servieAmount: " + serviceAmount + "amount: " + amount +"|newTotalAmount="+newTotalAmount);
                count++;

            }





        }


    }

    public static double formatDouble1(double d) {
        return (double)Math.round(d*100)/100;
    }
}
