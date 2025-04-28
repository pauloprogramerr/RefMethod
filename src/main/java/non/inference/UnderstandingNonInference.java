package non.inference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class UnderstandingNonInference {
    private int totalHours;

    static List<Integer> hours = new ArrayList<>(
            Arrays.asList(
                    32, 40, 54, 23, 35, 48, 40, 40, 23,
                    54, 45, 44, 45, 65, 34, 35, 42, 42, 50, 45,
                    35, 45, 35, 31, 12, 56)
    );

    /*
     * This will generate a ConcurrentModificationException exception, since we are
     * trying to modify an ArrayList instance, which is not thread safe
     */
    public void understandNonInference() {

        Stream<Integer> hoursStream;
        hoursStream = hours.parallelStream();

        totalHours = hoursStream
                .map( h -> {
                    int amount = h * 30;
                    if (amount>40)
                        hours.add(h+10);
                    return amount;
                }).reduce(0, Integer::sum); // estava (r, s) -> r + s

    }

    /*
     * We can avoid this
     * problem using the CopyOnWriteArrayList class instead, which permits concurrent
     * modifications of the list
     */
    public int understandCopyOnWriteArrayList(){
        CopyOnWriteArrayList<Integer> concurrentHours =
                new CopyOnWriteArrayList<>(
                        Arrays.asList(32, 40, 54, 23, 35, 48, 40, 40, 23,
                                54, 45, 44, 45, 65, 34, 35, 42, 42, 50, 45,
                                35, 45, 35, 31, 12, 56));
        Stream<Integer> hoursStream;
        hoursStream = concurrentHours.parallelStream();
        totalHours = hoursStream
                .map(h -> {
                    int amount =h*30;
                    if(amount>40) {
                        concurrentHours.add(h+10);
                    }
                    return amount;
                })
                .reduce(0, Integer::sum); // estava (r, s) -> r + s)

        return totalHours;
    }

    public static void overTimeHours(){
        /*
         *  Since the array list is not thread safe, concurrent modification of the list may produce
         * errors. When this example is executed repeatedly, null values may creep in or an
         * ArrayIndexOutOfBoundsException exception may be generated. This is more
         * pronounced when many of the hours exceed 40.
         *  An alternative approach to solve this problem is to use the collect method with the
         * Collectors class's toList method. This will safely create a new list
         */
        List<Integer> overtimeList = new ArrayList<>();
        hours.parallelStream()
                .filter(h -> h > 40)
                .forEach(overtimeList::add); // estava s -> overtimeList.add (s)
        for (Integer hour : overtimeList) {
            System.out.println(hour + " ");
        }
        System.out.println ();

        List<Integer> overtimeLists; //= new ArrayList<>();
        overtimeLists = hours
                .parallelStream ()
                .filter ( s -> s > 40)
                .toList (); // estava collect (Collectors.toList ())

        System.out.println (overtimeLists.stream().distinct ().toList ());
    }

    /*
     * Some side effects such as displaying intermediate results can be tolerated. However,
     * side effects should be avoided when using a functional style of programming.
     */

    public void sideEffectsShouldBeAvoided() {
        hours.parallelStream()
                .filter (s -> s > 40)
            //    .sorted ()
                .forEach (h -> System.out.println (h + " "));
        System.out.println ();
    }
}
