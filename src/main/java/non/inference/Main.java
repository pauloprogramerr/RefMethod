package non.inference;

import static non.inference.ConvertingLoopToRecursiveSolution.recursiveSum;

public class Main {

    public static void main(String[] args) {
//
        RecursionTechniquesInJava8 e = new RecursionTechniquesInJava8();
         e.factorial (5);

        UsingTheHeadAndTailRecursion u = new UsingTheHeadAndTailRecursion ();
        u.inOrder (Node.nodeRoot ());
        System.out.println ();
        System.out.println (u.gcd (48, 72));
        System.out.println (u.gcd (182, 154));

        FibonacciSequence f = new FibonacciSequence ();
        System.out.println (f.fib (11));

        System.out.println (recursiveSum(20));

        ConvertingLoopToRecursiveSolution cs = new ConvertingLoopToRecursiveSolution ();
//        cs.CommomLoop ();

        UnderstandingNonInference n = new UnderstandingNonInference ();
        n.understandCopyOnWriteArrayList ();
        n.sideEffectsShouldBeAvoided ();
        n.understandNonInference ();
        UnderstandingNonInference.overTimeHours ();

    }
}
