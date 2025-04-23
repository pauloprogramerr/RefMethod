package non.inference;

public class UsingTheHeadAndTailRecursion {

    public void inOrder(Node node){
        if (node == null){
            System.out.println("estava return");
        } else {
            inOrder (node.left ());
            System.out.print (node.getValue () + " ");
            inOrder (node.right ());
        }
    }

    /**
     *  In the following implementation, the two conditions are specified using the then and
     * else clauses of an if statement. In the then clause, we simply return x. In the else
     * clause, we perform the recursive call
     */

    public int gcd (int x, int y) {
        if (y == 0) {
            return x;
        }
        else {
            return gcd (x, x % y); //paramentro é y
        }
    }
}
