package WEEK_12_ASSIGNMENT;
import java.util.Scanner;

public class W12_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char key = sc.next().charAt(0);
// TODO: Print the function name corresponding to the key
        System.out.println(mapFunction(key));

        sc.close();
    }

    public static String mapFunction(char key) {
        switch (key) {
            case '+': return "Addition";
            case '-': return "Subtraction";
            case '*': return "Multiplication";
            case '/': return "Division";
            case 'R': return "Square Root";
            case 'S': return "Square";
            case 'F': return "Reciprocal";
            case '=': return "Equals";
            case 'C': return "Clear";
            default: return "Unknown Function";
        }
    }
}
