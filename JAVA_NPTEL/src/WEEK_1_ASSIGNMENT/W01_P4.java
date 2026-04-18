/*
Write a Java program to print the multiplication table of a given number up to 4.
NOTE:
Print EXACTLY as shown in the sample output.
DO NOT MISS a single space otherwise you will not be scored.
        (Remember to match the output given exactly, including the spaces and new lines)
        (passed with presentation error means you will get full marks)*/
package WEEK_1_ASSIGNMENT;
import java.util.Scanner;

public class W01_P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
// Print the multiplication table of number up to 5
        for(int i = 1; i <= 4; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        in.close();
    }
}