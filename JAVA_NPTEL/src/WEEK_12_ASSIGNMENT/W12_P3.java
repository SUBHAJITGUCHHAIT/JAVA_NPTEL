package WEEK_12_ASSIGNMENT;
import java.util.Scanner;

public class W12_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);
// TODO: Call the operate method and print the result
        System.out.println(operate(a, b, op));

        sc.close();
    }

    public static double operate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0.0;
        }
    }
}