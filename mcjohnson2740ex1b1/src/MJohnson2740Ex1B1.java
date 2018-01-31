public class MJohnson2740Ex1B1 {
    public static void main(String[] args) {
        int custNum = 101 ;
        int therm = 1001;


        int time2 = 10;
        int time3 = 20;
        int time4 = 30;
        int time5 = 50;

        int temp1 = 60;
        int temp2 = 70;
        int temp3 = 80;
        int temp4 = 44;


        int contr1 = time2 * temp1;
        int contr2 = (time3 - time2) * temp2;
        int contr3 = (time4 - time3) * temp3;
        int contr4 = (time5 - time4) *temp4;

        double AverageTemp = (double)(contr1 + contr2 + contr3 + contr4) / time5;




        String LastName;
        String FirstName;

        LastName = "Johnson";
        FirstName = " Michael ";



        System.out.println("Customer: " + custNum +  FirstName +  LastName);
        System.out.println("Thermometer#: " + therm);
        System.out.println("Average Temperature " + AverageTemp);







    }
}
