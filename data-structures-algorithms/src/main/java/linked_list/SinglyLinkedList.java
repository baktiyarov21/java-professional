package linked_list;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int value) {
        head = new Node(); // O(1)
        Node node = new Node(); // O(1)
        node.next = null; // O(1)
        node.value = value; // O(1)
        head = node; // O(1)
        tail = node; // O(1)
        size = 1; // O(1)
        return head;
    }

}
