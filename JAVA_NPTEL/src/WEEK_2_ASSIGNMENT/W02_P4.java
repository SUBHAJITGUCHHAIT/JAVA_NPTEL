package WEEK_2_ASSIGNMENT;

import java.util.Scanner;

public class W02_P4 {

    static class Rectangle {
        int length;
        int width;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int w = sc.nextInt();

        Rectangle rect = new Rectangle();
        rect.length = l;
        rect.width = w;
// NOVICE NOTE:
        // Access values using object name.
        // Do not use input variables directly.
        // Combine values stored inside the object.

        // TODO: Print the required output

        System.out.print("Sum of length and width is: " + (rect.length + rect.width));
        sc.close();
    }
}
