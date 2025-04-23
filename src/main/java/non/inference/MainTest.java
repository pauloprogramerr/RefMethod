package non.inference;

public class MainTest {
    private String m;
    public MainTest (String m) {
       this.m = m;
    }


    public static void main(String[] args) {
        MainTest m = new MainTest ("Hello");
        System.out.println (m.m);

    }
}
