package WEEK_8_ASSIGNMENT;
import java.util.Scanner;

public class W08_P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
// Step 1: Check if matrix multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Multiplication Not Possible");
            return;
        }

// Step 2: Initialize result matrix
        int[][] result = new int[rows1][cols2];

// Step 3: Matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

// Step 4: Print result matrix
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j]);
                if (j < cols2 - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}