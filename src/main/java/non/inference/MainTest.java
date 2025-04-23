package non.inference;

public class MainTest {
    private String m;
    public MainTest (String m) {
       this.m = m;
    }
    public MainTest(){
    }

    public static void main(String[] args) {
        MainTest m = new MainTest ("Hello");
        System.out.println (m.m);

        MainTest mainTest = new MainTest ();
        System.out.println (mainTest);
    }
}
