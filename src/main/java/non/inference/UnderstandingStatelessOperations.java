package non.inference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UnderstandingStatelessOperations {
    public static int rate = 30;
    public int getPay(int hours) {
        if (hours > 40) {
            rate = 25;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                // Handle exception (Execuçã imcompleta finalizá-la)
            }
        } else {
            rate = 30;
        }
        return rate * hours;
    }

    public static void main(String[] args) {
        UnderstandingStatelessOperations u = new UnderstandingStatelessOperations();
        List<Integer> hours
                = Arrays.asList(32, 40, 24, 23, 35, 18, 40, 30, 23,
                54, 35, 34, 25, 15, 34, 35, 42, 44, 40, 35,
                35, 45, 35, 31, 12, 56, 31, 12, 56);
        Stream<Integer> hoursStream = Stream.empty(); // fazer algumas correções
        for(int i=0; i<2; i++) {
            rate = 30;
            int total = hours
                    .parallelStream()
                    .map(u::getPay) //estava h -> u.getPay(h)
                    .reduce(0, Integer::sum);
            System.out.println(total);
            System.out.println (hoursStream);

        }
    }
}
