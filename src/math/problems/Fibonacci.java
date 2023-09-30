package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


        public class FibonacciExample {
            public static void main(String[] args) {
                int n = 40;

                System.out.println("First 40 Fibonacci numbers:");
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci(i) + ", ");
                }
            }

            public static int fibonacci(int n) {
                if (n <= 1) {
                    return n;
                } else {
                    return fibonacci(n - 1) + fibonacci(n - 2);
                }
            }
        }

    }
}
