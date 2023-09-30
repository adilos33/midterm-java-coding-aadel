package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *

public class FactorialExample {
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;

        int factorialRecursiveResult = factorialRecursive(number);
        System.out.println("Factorial of " + number + " using recursion: " + factorialRecursiveResult);

        int factorialIterativeResult = factorialIterative(number);
        System.out.println("Factorial of " + number + " using iteration: " + factorialIterativeResult);
    }
}




