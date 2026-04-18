package WEEK_2_ASSIGNMENT;

import java.util.Scanner;

public class W02_P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();
// BEGINNER GUIDANCE:
        // First combine both values.
        // Then apply multiplication.
        // Use brackets to control execution order.
        //
        // Without brackets, result will be wrong.

        // TODO: Write the expression correctly

        int perimeter = 2 * (length + width);
        System.out.println("Perimeter is: " + perimeter);
        sc.close();
    }
}