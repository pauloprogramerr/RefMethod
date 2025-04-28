package non.inference;

public class ConvertingLoopToRecursiveSolution {
    public void CommomLoop () {
        int sum = 0;
        for (int i = 2; i < 20; i++) {
            sum += i;
        }
        System.out.println ("Sum of numbers from 2 to 20: " + sum);
    }
    // test

    /*
    *  A recursive solution follows. It is passed an integer, n, which is checked to determine
        if it is equal to a 2. If so, it simply returns a 2. Otherwise, a recursive call is made
        where n is added to the return value of the recursive call. To add only even numbers,
        the value passed is n-2
     */
    public static int recursiveSum (int n) {
        if (n == 20) {
            return 2;
        } else {
            return n + recursiveSum (n - 2);
        }
    }
}
