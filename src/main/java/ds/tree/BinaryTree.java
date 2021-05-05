package ds.tree;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public void preorder(Node node) {
        if (node == null)
            return;

        System.out.println(node.key + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.println(node.key + " ");
        inorder(node.right);
    }

    public void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.key + " ");
    }

    void preorder() { preorder(root); }
    void inorder() { inorder(root); }
    void postorder() { postorder(root); }

    public static void main (String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);

        System.out.println("Preorder traversal: ");
        tree.preorder();
        System.out.println("\nInorder traversal: ");
        tree.inorder();
        System.out.println("\nPostorder traversal: ");
        tree.postorder();
    }
}

class Node {
    Node left;
    Node right;
    int key;

    public Node(int data) {
        key = data;
        left = right = null;
    }
}