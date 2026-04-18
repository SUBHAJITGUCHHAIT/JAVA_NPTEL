package WEEK_12_ASSIGNMENT;
import java.util.Scanner;

public class W12_P1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char seq[] = input.toCharArray();
        int outflag = 0;
// ================================================
// INSTRUCTIONS:
// Convert each character in seq[] using the gui_map method.
// Only a loop and one assignment are required.
// ================================================

// TODO: Apply gui_map to each element of seq[]
// TODO: Apply gui_map to each element of seq[]
        for (int i = 0; i < seq.length; i++) {
            seq[i] = gui_map(seq[i]);
        }

        double operand1 = 0.0, operand2 = 0.0, output = 0.0;
        String o1 = "", o2 = "";

        outerloop:
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == 'C') {
                operand1 = 0.0;
                operand2 = 0.0;
                output = 0.0;
                outflag = 0;
                break outerloop;
            } else if (seq[i] == 'R') {
                for (int j = 0; j < i; j++) o1 += seq[j];
                operand1 = Double.parseDouble(o1);
                output = Math.sqrt(operand1);
                outflag = 1;
                break outerloop;
            } else if (seq[i] == 'S') {
                for (int j = 0; j < i; j++) o1 += seq[j];
                operand1 = Double.parseDouble(o1);
                output = Math.pow(operand1, 2);
                outflag = 1;
                break outerloop;
            } else if (seq[i] == 'F') {
                for (int j = 0; j < i; j++) o1 += seq[j];
                operand1 = Double.parseDouble(o1);
                output = Math.pow(operand1, -1);
                outflag = 1;
                break outerloop;
            } else {
                if (seq[i] == '+' || seq[i] == '-' || seq[i] == '/' || seq[i] == '*' || seq[i] == '=') {
                    for (int j = 0; j < i; j++) o1 += seq[j];
                    operand1 = Double.parseDouble(o1);
                    for (int k = i + 1; k < seq.length; k++) {
                        if (seq[k] == '=') {
                            operand2 = Double.parseDouble(o2);
                            if (seq[i] == '+') output = operand1 + operand2;
                            else if (seq[i] == '-') output = operand1 - operand2;
                            else if (seq[i] == '*') output = operand1 * operand2;
                            else if (seq[i] == '/') output = operand1 / operand2;
                            outflag = 1;
                            break outerloop;
                        } else {
                            o2 += seq[k];
                        }
                    }
                }
            }
        }

        if (outflag == 1)
            System.out.println(output);
    }

    static char gui_map(char in) {
        char out = 'N';
        char gm[][] = {
                {'a','R'}, {'b','0'}, {'c','.'}, {'d','='}, {'e','1'}, {'f','2'},
                {'g','3'}, {'h','+'}, {'i','4'}, {'j','5'}, {'k','6'}, {'l','-'},
                {'m','7'}, {'n','8'}, {'o','9'}, {'p','*'}, {'q','S'}, {'r','F'},
                {'s','C'}, {'t','/'}
        };

        for (int i = 0; i < gm.length; i++) {
            if (gm[i][0] == in) {
                out = gm[i][1];
                break;
            }
        }
        return out;
    }
}