package non.inference;

public class UsingWrapperMethod {
    public int arrayTotal(int[] number, int index ){
        if (index == 0) {
            return number[0];
        }
        else {
            return number[index] + arrayTotal (number, index - 1);
        }
    }

    public int totalHelper(int[] number, int index) {
        if (index >= 0 && index <= number.length - 1) {
            return number[index] + totalHelper (number, index - 1);
        }
        else {
            // Handle exception
            return 0;
        }
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }else {
            if (node.left() != null) {
                inOrder (node.left());
            }
        }
        System.out.print (node.getValue () + " ");
        if (node.right() != null) {
            inOrder (node.right());
        }
    }
}
