package WEEK_6_ASSIGNMENT;
class Printer {
    synchronized void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(300);
            } catch (Exception e) {}
        }
    }
}

class T1 extends Thread {
    Printer p;
    T1(Printer p){ this.p=p; }
    public void run(){ p.print(2); }
}

class T2 extends Thread {
    Printer p;
    T2(Printer p){ this.p=p; }
    public void run(){ p.print(3); }
}

public class W06_P4 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        new T1(obj).start();
        new T2(obj).start();
    }
}