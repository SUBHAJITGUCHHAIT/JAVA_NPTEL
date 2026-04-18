package WEEK_6_ASSIGNMENT;
// Complete the class by extending Thread
public class W06_P1 extends Thread {

    public void run() {
        System.out.print("Hello from Thread");
    }
    public static void main(String[] args) {
        W06_P1 t = new W06_P1();
        t.start();
    }
}
