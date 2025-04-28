package non.inference;

public class FibonacciSequence {

    // Tradicional
    public int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n <= 1) {
            return 1;
        }else
            return fib(n - 1) + fib(n - 2);

    }
}
