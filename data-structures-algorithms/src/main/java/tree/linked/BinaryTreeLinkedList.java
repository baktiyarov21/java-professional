package tree.linked;

public class BinaryTreeLinkedList {
    public BinaryNode root;

    public BinaryTreeLinkedList() {
        this.root = null;
    }

    public void preOrder(BinaryNode node) {
        if (node == null) { // O(1)
            return; // O(1)
        }
        System.out.print(node.value + "->"); // O(1)
        preOrder(node.left); // O(N/2)
        preOrder(node.right); // O(N/2)
    }

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + "->");
        inOrder(node.right);
    }

}
