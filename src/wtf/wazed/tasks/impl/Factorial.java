package wtf.wazed.tasks.impl;

import wtf.wazed.tasks.GenericTask;

/**
 * @author Wazed
 * Created on 22.09.2020
 */
public class Factorial extends GenericTask {
    @Override
    public void execute() {
        System.out.println(factorial(10));
    }

    /**
     * Factorial of n
     * @param n
     * @return the factorial of(n)
     */
    public int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }
}
