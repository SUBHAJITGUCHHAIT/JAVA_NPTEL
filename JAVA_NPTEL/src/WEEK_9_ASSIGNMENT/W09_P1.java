package WEEK_9_ASSIGNMENT;
import java.util.Scanner;
public class W09_P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        // INPUT
        for (int i = 0; i < 5; i++) {

            if (!sc.hasNext()) {
                System.out.println("Invalid input");
                return;
            }

            String row = sc.next();

            if (row.length() != 5) {
                System.out.println("Invalid input");
                return;
            }

            for (int j = 0; j < 5; j++) {
                char ch = row.charAt(j);

                if (ch == '0' || ch == '1') {
                    matrix[i][j] = ch - '0';
                } else {
                    System.out.println("Invalid input");
                    return;
                }
            }
        }

        // OUTPUT (Flip-Flop)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(1 - matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    } // The main() ends here
} // The main class ends here