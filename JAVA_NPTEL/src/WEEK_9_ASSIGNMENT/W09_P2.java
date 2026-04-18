package WEEK_9_ASSIGNMENT;
import java.util.Scanner;
public class W09_P2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Read as string, e.g., 5+6
        double num1 = 0, num2 = 0;
        char operator = ' ';

        // Find operator and split numbers
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator = ch;

                num1 = Double.parseDouble(input.substring(0, i));
                num2 = Double.parseDouble(input.substring(i + 1));
                break;
            }
        }

        double result = 0;

        // Perform operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero error");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        // Round result
        long roundedResult = Math.round(result);

        // Output format (IMPORTANT spacing)
        System.out.println(input + " = " + roundedResult);

        sc.close();
    } // The main() ends here
} // The main class ends here