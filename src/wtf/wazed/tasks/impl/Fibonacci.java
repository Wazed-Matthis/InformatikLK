package wtf.wazed.tasks.impl;

import wtf.wazed.tasks.GenericTask;

/**
 * @author Wazed
 * Created on 22.09.2020
 */
public class Fibonacci extends GenericTask {

    @Override
    public void execute() {
     /*   System.out.println(fibonacciIterative(20));
        System.out.println(fibonacciRecursion(20));*/
    }

    /**
     * Fibunacci Zahlen iterativ
     * @param until Bis zur welchen iteration es iterieren soll
     * @return
     */
    private static int fibonacciIterative(int until) {
        //definiere und weise wert zu variablen zu
        int secondPrev, prevNumber = 0, currNumber = 1;
        for (int i = 1; i < until; i++) {
            /*
                Verschiebe Zahlen
             */
            secondPrev = prevNumber;
            prevNumber = currNumber;
            currNumber = secondPrev + prevNumber;
        }
        //gebe Zahl zurück
        return currNumber;
    }


    /**
     * Fibunacci Zahlen Rekursiv
     * @param until Bis zur welchen Rekursion es gehen soll
     * @return
     */
    private static int fibonacciRecursion(int until) {
        //Frage ab ob die Zahl 0 oder 1, da -2 oder -1
        if (until == 0) return 0;
        else if (until == 1) return 1;
        //Recursion happens here: fibonacciRecursion wird 2 mal aufgerufen innerhalb von fibonacciRecursion
        return fibonacciRecursion(until - 2) + fibonacciRecursion(until - 1);
    }

}
