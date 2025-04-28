package non.inference;

import java.util.stream.Stream;

public class MainTest {
    private String m;
    public MainTest (String m) {
       this.m = m;
    }

    public static void testTestando(){
        Stream<String> test = Stream.of("testando");
        test.map ( s -> s.length ())
                .distinct ()
                .sorted ()
                .forEach (System.out::println);
    }

    public static void main(String[] args) {
        MainTest m = new MainTest ("Hello");
        System.out.println (m.m);
        testTestando ();

        MergingTwoLists mg = new MergingTwoLists ();
//        mg.passList ();
        System.out.println ();

        RecursiveLambdaExpression re = new RecursiveLambdaExpression ();
        re.recurive ();
    }
}
