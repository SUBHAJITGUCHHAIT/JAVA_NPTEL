package WEEK_7_ASSIGNMENT;
import java.util.Scanner;

public class W07_P5 {
    private String password;

    // Step 1: Constructor to initialize the password variable
    public W07_P5(String password) {
        this.password = password; // Assign the passed password to the instance variable
    }
    // ================================
    // Note: Try solving it without hints first-only check if you're truly stuck.
    // Avoid AI or internet searches; quick answers won't build real skills.
    // Struggle a bit, learn for life! Be honest with yourself!
    //
// ================================
    // TODO: Implement isValidPassword() method to check if the password meets:
    //       1. At least 8 characters long.
    //       2. Contains at least one uppercase letter.
    //       3. Contains at least one number.
    //
    // Instructions:
    // - Use an 'if' condition to check the password length.
    // - Use a loop to go through each character in the password.
    // - Use Character.isUpperCase() to check for uppercase letters.
    // - Use Character.isDigit() to check for numbers.
    // - Return true if all conditions are met; otherwise, return false.
    //
    // Hint: You can use a boolean flag for uppercase and digit checks and update them inside the loop.


    // Important: please delete the below code and first try by yourself---use the below hint code only when you can't do after multiple try
    public static boolean isValidPassword(String password){

        if(password == null || password.length()<8){
            return false;
        }

        boolean hasUppercase=false;
        boolean hasDigit=false;

        for(char ch : password.toCharArray()){

            if(Character.isUpperCase(ch)){
                hasUppercase = true;
            }

            if(Character.isDigit(ch)){
                hasDigit=true;
            }

            if(hasUppercase && hasDigit){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read password input from user
        String inputPassword = scanner.nextLine();
        scanner.close();
        W07_P5 validator = new W07_P5(inputPassword);

        // Check password validity and print result
        if (validator.isValidPassword(inputPassword)) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Invalid Password");
        }

        scanner.close();
    }
}