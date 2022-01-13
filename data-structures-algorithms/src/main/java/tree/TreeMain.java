package tree;

import tree.linked.BinaryNode;
import tree.linked.BinaryTreeLinkedList;

public class TreeMain {
    public static void main(String[] args) {
        TreeNode src = new TreeNode("src");
        TreeNode main = new TreeNode("main");
        TreeNode test = new TreeNode("test");
        TreeNode java = new TreeNode("java");
        TreeNode resources = new TreeNode("resources");
        src.addChild(main);
        src.addChild(test);
        main.addChild(java);
        main.addChild(resources);
        System.out.println(src.print(1));

        BinaryTreeLinkedList binaryTree = new BinaryTreeLinkedList();
        BinaryNode node1 = new BinaryNode();
        node1.value = "N1";
        BinaryNode node2 = new BinaryNode();
        node2.value = "N2";
        BinaryNode node3 = new BinaryNode();
        node3.value = "N3";
        BinaryNode node4 = new BinaryNode();
        node4.value = "N4";
        BinaryNode node5 = new BinaryNode();
        node5.value = "N5";
        BinaryNode node6 = new BinaryNode();
        node6.value = "N6";
        BinaryNode node7 = new BinaryNode();
        node7.value = "N7";
        BinaryNode node8 = new BinaryNode();
        node8.value = "N8";
        BinaryNode node9 = new BinaryNode();
        node9.value = "N9";

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node4.right = node9;
        binaryTree.root = node1;
        System.out.println(binaryTree.root.value);
        binaryTree.preOrder(binaryTree.root);

        System.out.println();
        binaryTree.inOrder(binaryTree.root);




    }
}
