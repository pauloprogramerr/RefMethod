package non.inference;

import java.util.function.Consumer;

public class RecursiveLambdaExpression {

    Consumer<Node> inoder;
    public int total = 0;
    public void recurive() {

        inoder = (Node node) -> {
            if (node == null) {
                return;
            }else {
                inoder.accept(node.left());
                System.out.print(node.getValue() + " ");
                inoder.accept(node.right());
            }
        };

        Node root = new Node(12);
        root.addLeft (8).addRight (9);
        root.addRight (18).addLeft (14).addRight (17);
        inoder.accept (root);
    }
    public int arrayTotal(int [] numbers, int index) {

        if (index == 0) {
            return numbers[0];
        }
        else {

            /* return numbers[index] + arrayTotal (numbers, index - 1); */
            // operador pos-decremento
            // return numbers[index] + arrayTotal (numbers, index--);

            // operador pre-decremento
               return numbers[index] + arrayTotal (numbers, --index);
            // This will produce the correct answer

        }

    }
}
