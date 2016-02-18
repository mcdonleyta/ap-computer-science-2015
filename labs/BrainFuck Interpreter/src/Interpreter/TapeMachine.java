package Interpreter;

import java.util.ArrayList;

/**
 * Created by jsdsp on 2/17/16.
 */
public class TapeMachine implements Turing{
    ArrayList<Integer> ptape; //positive tape (includes 0)
    ArrayList<Integer> ntape; //negative tape (0 isn't used)
    private int head;

    TapeMachine() {
        ptape = new ArrayList<>();
        ptape.add(0);
        ntape = new ArrayList<>();
        ntape.add(0);
        ntape.add(0);
        head = 0; //index that we are looking at
    }

    public void moveLeft() {
        if(-head >= ntape.size()-1)
            ntape.add(0);

        head--;
    }

    public void moveRight() {
        if(head >= ptape.size()-1) //makes list effectively infinite
            ptape.add(0);
        head++;
    }

    public void inc() {
        if(head >= 0)
            ptape.set(head, ptape.get(head) +1);
        else
            ntape.set(-head, ntape.get(-head) +1);
    }

    public void dec() {
        if(head >= 0)
            ptape.set(head, ptape.get(head) -1);
        else
            ntape.set(-head, ntape.get(-head) -1);
    }

    public int getValue() {
        if(head >= 0)
            return ptape.get(head);
        else return ntape.get(-head);
    }

}
