package WEEK_7_ASSIGNMENT;
import java.util.Scanner;

public class W07_P3{
//Code to create function primesum(), compute the sum of all prime numbers in a given range.


    static boolean checkPrime(int numberToCheck)
    {
        if(numberToCheck == 1) {
            return false;
        }
        for (int i = 2; i*i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to iterate the loop from l to r
    // If prime number detects, sum the value
    static int primeSum(int l, int r)
    {
        int sum = 0;
        for (int i = r; i >= l; i--) {

            // Check for prime
            boolean isPrime = checkPrime(i);
            if (isPrime) {

                // Sum the prime number
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(primeSum(x, y));
    }
}