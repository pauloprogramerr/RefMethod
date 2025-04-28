package non.inference;

import java.util.Arrays;
import java.util.List;

public class UnderstandingTheOrdering {
    List<Integer> hours
            = Arrays.asList(32, 40, 24, 23, 35, 18, 40, 30, 23,
            54, 35, 34, 25, 15, 34, 35, 42, 44, 40, 35,
            35, 45, 35, 31, 12, 56, 31, 12, 56);
//
    public void hourstThatAreGreaterThan40() {

        /* However, the list is not sorted */
        hours.parallelStream ()
                .filter (s -> s > 40)
               // .sorted ()
                .forEach (System.out::println);
        System.out.println ();

        /*
         *  The order will vary with each execution because each parallel stream sorted
         * its elements, but when the streams merge they are not sorted. Instead, use the
         * forEachOrdered method, which forces the stream to process the stream elements
         * in the encountered order as shown next. However, this method can distract from
         * the efficiency gained from parallel streams
         */
        hours.parallelStream ()
                .filter (s -> s > 40)
                .sorted ()
                .forEachOrdered (System.out::println);
        System.out.println ();
    }
    /** Parallel operations can significantly improve the performance of an application,
     allowing us to take full advantage of multiple processors. However, care must be taken
     when working with parallel streams to avoid unintended consequences. We provided
     an introduction to several of the issues that can affect parallel streams. You are
     encouraged to carefully consider the consequences of using these types of operations.
     */

    public static void main(String[] args) {
        UnderstandingTheOrdering u = new UnderstandingTheOrdering ();
        u.hourstThatAreGreaterThan40 ();

    }
}
