package tree.linked;

import java.util.LinkedList;
import java.util.Queue;

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

    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left); // O(N/2)
        postOrder(node.right); // O(N/2)
        System.out.print(node.value + "->"); // O(N/2)
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>(); // O(1)
        queue.add(root); // O(1)
        while (!queue.isEmpty()) { // O(N)
            BinaryNode presentNode = queue.remove(); // O(1)
            System.out.print(presentNode.value + "->"); // O(1)
            if (presentNode.left != null) { // O(1)
                queue.add(presentNode.left); // O(1)
            }
            if (presentNode.right != null) { // O(1)
                queue.add(presentNode.right); // O(1)
            }
        }
    }

    public void searchNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>(); // O(1)
        queue.add(root); // O(1)
        while (!queue.isEmpty()) { // O(N)
            BinaryNode presentNode = queue.remove(); // O(1)
            if (presentNode.value.equals(value)) {
                System.out.println(value + " is found in Tree");
                return;
            } else {
                if (presentNode.left != null) { // O(1)
                    queue.add(presentNode.left); // O(1)
                }
                if (presentNode.right != null) { // O(1)
                    queue.add(presentNode.right); // O(1)
                }
            }
        }
        System.out.println(value + " is not found");
    }

    public void insetNode(String value) {
        BinaryNode newNode = new BinaryNode(); //O(1)
        newNode.value = value; //O(1)
        if (root == null) { //O(1)
            root = newNode; //O(1)
            System.out.println("New node is Root"); //O(1)
        } else {
            Queue<BinaryNode> queue = new LinkedList<>(); //O(1)
            queue.add(root); //O(1)
            while (!queue.isEmpty()) { //O(N)
                BinaryNode presentNode = queue.remove(); //O(1)
                if (presentNode.left == null) { //O(1)
                    presentNode.left = newNode; //O(1)
                    System.out.println(value + "'s inserted"); //O(1)
                    break;
                } else if (presentNode.right == null) { //O(1)
                    presentNode.right = newNode; //O(1)
                    System.out.println(value + "'s inserted"); //O(1)
                    break;
                } else {
                    queue.add(presentNode.left); //O(1)
                    queue.add(presentNode.right); //O(1)
                }
            }
        }
    }

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);

        }
    }

    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                System.out.println(value + "'s deleted");
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
    }

}
