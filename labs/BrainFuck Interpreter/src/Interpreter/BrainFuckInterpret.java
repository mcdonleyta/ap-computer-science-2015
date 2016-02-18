package Interpreter;

/**
 * Created by jsdsp on 2/17/16.
 */
public class BrainFuckInterpret {

    TapeMachine tm;

    public BrainFuckInterpret() {
        tm = new TapeMachine();
    }

    private int findCorrespondingCloseBracket(String code, int openIndex) {
        int howDeep = 1;
        for(int a = openIndex+1; a < code.length(); a++) {
            if (code.charAt(a) == '[')
                howDeep++;
            else if(code.charAt(a) == ']')
                howDeep--;
            if(howDeep == 0)
                return a;
        }
        return -1; //only returns -1 if corresponding close bracket couldn't be found, meaning input code is invalid
    }

    public void run(String code) {
        for(int a = 0; a < code.length(); a++) {
            if(code.charAt(a) == '>')
                tm.moveRight();
            else if(code.charAt(a) == '<')
                tm.moveLeft();
            else if(code.charAt(a) == '+')
                tm.inc();
            else if(code.charAt(a) == '-')
                tm.dec();
            else if(code.charAt(a) == '.') {
                int val = tm.getValue();
                char ascii = (char)val;
                System.out.println(Integer.toString(val) + " " + ascii); //prints number and corresponding ascii char
            }
            else if(code.charAt(a) == '[') {
                int correspondingClose = findCorrespondingCloseBracket(code, a);
                do{
                    run(code.substring(a+1, correspondingClose)); //runs inside brackets again
                } while(tm.getValue() > 0); //loops until current index is 0
                a = correspondingClose; //evaluation of code inside brackets is done; move to after brackets
            }
        }
    }

}
