package wtf.wazed.tasks.impl;

import wtf.wazed.tasks.GenericTask;

/**
 * @author Wazed
 * Created on 21.09.2020
 */
public class Factorial extends GenericTask {
    @Override
    public void execute() {
        System.out.println(factorialRecursive(10));
        System.out.println(factorialIterative(10));
    }

    /**
     * Iterative Factorial of n
     * @param n
     * @return the factorial of(n)
     */
    public int factorialIterative(int n){
        int temp = 1;
        for(int i = n; i > 1; i--){
            temp = temp * i;
        }
        return (n == 0 || n == 1) ? 1 : temp;
    }

    /**
     * Recursive Factorial of n
     * @param n
     * @return the factorial of(n)
     */
    public int factorialRecursive(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorialRecursive(n - 1);
    }
}
