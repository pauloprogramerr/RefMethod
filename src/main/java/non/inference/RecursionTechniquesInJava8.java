package non.inference;

public class RecursionTechniquesInJava8 {

    public long factorial (long n) {

        /*  iterative solution for the factorial of 5   */
        long fact = 1;
        for(int i=1; i<=5; i++) {
            fact *= i;
        }
        System.out.println ("Iterative solution for the factorial of 5: " + fact);

        if (n == 1){//
            return 1;
        }else {
            return n * factorial (n - 1);
        }
    }
}
