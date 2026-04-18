package WEEK_3_ASSIGNMENT;
import java.util.Scanner;
class W03_P1{
//Create recursive method to find factorial of a number

    //Uncomment or write on your own
//public static int factorial(int x){
//      if(x == 0 || x == 1){
//        return  _____________;
//      }
//      else{
//        return _____________ * x;
//      }
//    }
    public static int factorial (int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return factorial(n-1) * n;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.println(factorial(x));
    }
}
