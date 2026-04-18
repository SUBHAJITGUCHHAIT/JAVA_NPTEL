package WEEK_4_ASSIGNMENT;

import java.util.Scanner;
public class W04_P3 {
    static class Account {
        // Private variable
        private int balance;

        // Method to set balance
        public void setBalance(int b) {
            balance = b;
        }
// BEGINNER INSTRUCTION:
        // Create a method to return balance.
        // Method must be public.
        // Return the private variable.

        // TODO: Write getBalance method
        public int getBalance(){
            return balance;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        Account acc = new Account();
        acc.setBalance(b);
        System.out.println("Account Balance is: " + acc.getBalance());
        sc.close();
    }
}