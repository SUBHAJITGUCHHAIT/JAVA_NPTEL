// Complete the code fragment that reads two integer inputs from keyboard and compute the quotient and remainder.
package WEEK_1_ASSIGNMENT;

import java.util.Scanner;
public class W01_P5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
//code for quotient and remainder

// Uncomment and Complete this code below or create your own using the same variables
//int quotient= __________;
//int remainder= __________;

        int quotient = x / y;
        int remainder = x % y;
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
        sc.close();
    }
}
