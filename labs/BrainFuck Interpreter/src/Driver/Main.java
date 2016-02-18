package Driver;

import Interpreter.*;

import java.util.Scanner;

/**
 * Created by jsdsp on 2/17/16.
 */

// try: ++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.

public class Main {
    public static void main(String[] args) {
        BrainFuckInterpret bfi = new BrainFuckInterpret();
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        bfi.run(code);
    }
}
