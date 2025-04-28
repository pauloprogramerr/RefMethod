package non.inference;

public class HeadAndTailRecursion {

    public void head(String phrase){
        /*
            A string is passed to each method. If its length is zero, the method returns. With
            the head method, a recursive call is made and then the first character of the phrase
            is displayed. In the tail method, the first character is displayed followed by the
            recursive call
         */

        if (phrase.isEmpty ()){ // estava phrase.length () == 0
            return;
        }
        head (phrase.substring (1));
        //System.out.print (phrase.charAt (0)); não testado com a troca feita
        System.out.println(phrase);

    }
    public void tail(String phrase){
        if (phrase.isEmpty ()){ // estava phrase.length () == 0
            return;
        }
//        System.out.print (phrase.charAt (0));
        System.out.println(phrase);
        tail (phrase.substring (1));

    }//

    public static void main(String[] args) {
        HeadAndTailRecursion h = new HeadAndTailRecursion ();
        h.head("Recursion");
        System.out.println();
        h.tail("Recursion");
        System.out.println();
    }
}
