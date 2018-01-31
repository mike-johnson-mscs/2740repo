import java.util.Scanner;


public class MJohnson2740ex1c1


{
    public static void main(String[] args) {

        String LastName;
        String FirstName;
        String AccountNum;

        LastName = " \t\t\tJohnson";
        FirstName = "\t\t\tMichael";
        AccountNum = "\t\t\t1001";

        System.out.println("Customer:   " + AccountNum);
        System.out.println("LastName:   " + LastName);
        System.out.println("Firstname:  " + FirstName);


        Scanner sc = new Scanner(System.in);



        System.out.print("MonthlyIncome:\t\t\t"); double subtotal = sc.nextDouble();
        System.out.print("Rent:         \t\t\t");double Rent = sc.nextDouble();

        System.out.print("Electric      \t\t\t");double Electric = sc.nextDouble();

        System.out.print("Gas:          \t\t\t");double Gas = sc.nextDouble();

        System.out.print("Cable:        \t\t\t");double Cable = sc.nextDouble();

        System.out.println("Account:  \t " + FirstName + LastName + AccountNum);
        System.out.println( "NetIncome:\t\t\t\t " + (subtotal - (Rent + Electric + Gas + Cable)));












    }
}
