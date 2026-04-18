/*
 Write a Java program to calculate the volume of a cylinder given its radius and height.
Formula:
V = π x r^2 x h
You can use Math.PI for the computation.
NOTE:
The code you see is not complete.
Your task is to complete the code as per the question.
Think of it like a programming puzzle.
(This question can be solved in just one line of code)
*/

package WEEK_1_ASSIGNMENT;

import java.util.Scanner;

public class W01_P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
// Calculate the volume
        double volume = Math.PI * Math.pow(radius , 2) * height;
// Display the result
        System.out.printf("Volume is: %.2f", volume);
        in.close();
    }
}
