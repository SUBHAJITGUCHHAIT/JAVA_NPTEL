package WEEK_2_ASSIGNMENT;
import java.util.Scanner;

public class W02_P1 {
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Read the length of the rectangle
        int length = sc.nextInt();

        // Read the width of the rectangle
        int width = sc.nextInt();
// -------------------------------------------------
        // STUDENT INSTRUCTIONS:
        // You must calculate the area of the rectangle.
        // Area is calculated by multiplying length and width.
        // Store the result in an integer variable named area.
        //
        // HINT FOR BEGINNERS:
        // Use the * operator for multiplication.
        // Example thinking:
        // If length is 5 and width is 10,
        // then area becomes 50.
        // -------------------------------------------------

        // TODO: Write the area calculation here

        int area = length * width;
// Print the calculated area
        System.out.println("Area is: " + area);

        // Close the scanner
        sc.close();
    }
}
