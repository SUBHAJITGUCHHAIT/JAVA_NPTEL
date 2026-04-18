package WEEK_4_ASSIGNMENT;
import java.util.Scanner;

public class W04_P1 {

    // Student class with default access variable
    static class Student {

        // No keyword written before int
        // This means default access is applied
        int rollNo;

        // Constructor assigns value to rollNo
        Student(int r) {
            rollNo = r;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read roll number from user
        int r = sc.nextInt();

        // Create object of Student
        Student s = new Student(r);
// BEGINNER INSTRUCTION:
        // Access the roll number stored inside the object.
        // Use the object name followed by dot operator.
        // Do not create a new variable.
        // Print exactly in the required format.

        // TODO: Print the roll number here
        System.out.print("Roll Number is: " + s.rollNo);
        sc.close();
    }
}