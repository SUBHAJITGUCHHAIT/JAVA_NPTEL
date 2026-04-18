package WEEK_2_ASSIGNMENT;

import java.util.Scanner;

public class W02_P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
// BEGINNER INSTRUCTION:
        // Look at each value one by one.
        // Compare it with the stored maximum.
        // Replace maximum only if current value is larger.
        //
        // Remember:
        // Array indexing starts from 0.

        // TODO: Complete comparison logic

        for(int i = 0; i < arr.length; i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        System.out.println("Maximum is: " + max);
        sc.close();
    }
}