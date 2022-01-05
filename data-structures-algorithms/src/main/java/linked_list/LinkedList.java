package linked_list;

import linked_list.node.Node;
import linked_list.node.SinglyNode;

public interface LinkedList {
    Node createList(int value);
    void insertNode(int value, int location);
    void traverseList();
    boolean searchNode(int value);
    void deleteNode(int location);
    void deleteAll();
}
