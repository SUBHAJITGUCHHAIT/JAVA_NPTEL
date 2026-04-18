package WEEK_12_ASSIGNMENT;
import java.util.Scanner;

public class W12_P5 {

    // Helper method to replace calculator symbols with words
    public static String formatExpression(String input) {
        String output = input;
        output = output.replace("+", " Plus ");
        output = output.replace("-", " Minus ");
        output = output.replace("*", " Times ");
        output = output.replace("/", " Divided By ");
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String expression = sc.nextLine();
// TODO: Print the formatted calculator expression
        System.out.println(formatExpression(expression));

        sc.close();
    }
}