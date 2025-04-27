package non.inference;

public class TailCallOptimization {

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }else
            return gcd (y, x % y);
    }

    public long factorial(long n) {
        if (n == 1) {
            return 1;
        }else
            return n * factorial(n - 1);
    }
    public long factorialHelper(long n, long value) {
        if (n < 2){
            return value;
        } else {
            return factorialHelper(n - 1, n * value);
        }
    }
    public long factorialTail(long n) {
       return factorialHelper (n, 1);
    }
}
