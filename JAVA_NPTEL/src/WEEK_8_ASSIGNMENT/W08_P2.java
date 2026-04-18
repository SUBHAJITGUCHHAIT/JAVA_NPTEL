package WEEK_8_ASSIGNMENT;
import java.util.Scanner;

public class W08_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
// Initialize factorial variable

// Use loop to multiply values from 1 to n

// Print factorial

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial =factorial*i;
        }
        System.out.print(factorial);
        scanner.close();
    }
}