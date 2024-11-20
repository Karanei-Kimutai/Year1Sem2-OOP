package exemptionhandling;
//Import scanner class
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //Handle input mismatch
    public static void main(String[] args) {
        int x=0;
        //boolean checkstatus=false;
        System.out.println("Ënter an integer:");
        // while(true) {
             try {
                 Scanner in = new Scanner(System.in);
                 x = in.nextInt();
             } catch (InputMismatchException e) {
                 System.out.println("An error occurred.Please enter an integer:");
                 try {
                     Scanner in = new Scanner(System.in);
                     x = in.nextInt();
                 } catch (InputMismatchException l) {
                     System.out.println("An error occurred.Please enter an integer:");
                 }
             }
             System.out.println("You entered:" + x);
        // }


    }
}
