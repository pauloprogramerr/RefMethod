package non.inference;

public class Node {
    private final int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public Node(Node node) {
        this.value = node.value;
        this.right = null;
        this.left = null;
    }

    public int getValue() {
        return value;
    }

    public Node left() {
        return this.left;
    }

    public Node addLeft(int value) {
        Node node = new Node (value);
        this.left = node;
        return node;
    }

    public Node addLeft(Node node) {
        this.left = node;
        return this;
    }

    public Node right() {
        return this.right;
    }

    public Node addRight(int value) {
        Node node = new Node (value);
        this.right = node;
        return node;
    }

    public Node addRight(Node node) {
        this.right = node;
        return this;
    }

    public void posterOrder(Node node) {
        if (node != null) {
            posterOrder (node.left);
            posterOrder (node.right);
            System.out.print (node.value + " ");
        }
    }

    /*  Using_tail_Recursion
        The preorder traversal of _binary_tree illustrates tail recursion. The method is called
        twice at the end as shown in the following implementation */

    public void preOrder(Node node) {
        if (node == null) {
            System.out.println ("Coloque return aqui");
        } else {
            System.out.print (node.value + " ");
            preOrder (node.left);
            preOrder (node.right);
        }

    }

    public Node copyTree(Node node) {
        if (node == null) {
            return null;
        } else {
            return (new Node (node.value)).
                    addLeft (copyTree (node.left)).
                    addRight (copyTree (node.right));
        }
    }

    public static Node nodeRoot (){//
        Node root = new Node (12);
        root.addLeft (8).addRight (9);
        root.addRight (18).addLeft (14).addRight (17);
        return root;
    }

    private static long pow(long base, long exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            long intermediate = pow (base, exponent / 2);
            if (exponent % 2 == 0) {
                return intermediate * intermediate;
            } else {
                return intermediate * intermediate * base;
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node (12);
        root.addLeft (8).addRight (9);
        root.addRight (18).addLeft (14).addRight (17);
        root.posterOrder (root);
        System.out.println ();
        root.preOrder (root);

        System.out.println ();
        Node tree = root.copyTree (root);
        System.out.println (tree);
        System.out.println (pow (9, 5));
        new Node(tree);
        // fazer outro main para executar este arquivo
    }
}