package WEEK_4_ASSIGNMENT;
import java.util.Scanner;

public class W04_P2 {
    // Car class with a public variable
    static class Car {
        // Public variable
        public int speed;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read speed value
        int s = sc.nextInt();

        // Create object of Car
        Car c = new Car();

        // Assign value to public variable
        c.speed = s;
// BEGINNER INSTRUCTION:
        // Access the public variable using object name.
        // Print the value in required format.
        // Public variables do not need special methods.

        // TODO: Print the speed here
        System.out.print("Speed is: " + c.speed);
        sc.close();
    }
}
