package WEEK_8_ASSIGNMENT;
import java.util.Scanner;

public class W08_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
// Initialize variable to store sum of digits

// Extract digits using loop and add to sum

// Print the sum

        int sum = 0;
        while (number > 0) {
            sum += number%10;
            number /= 10;
        }
        System.out.print(sum);
        scanner.close();
    }
}