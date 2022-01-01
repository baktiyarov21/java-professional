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

    public void insertToLinkedList(int value,
                                   int location) {
        Node node = new Node(); // O(1)
        node.value = value; // O(1)
        if (head == null) {  // O(1)
            createSinglyLinkedList(value); // O(1)
        } else if (location == 0) { // O(1)
            node.next = node; // O(1)
            head = node; // O(1)
        } else if (location >= size){  // O(1)
            node.next = null;  // O(1)
            tail.next = node; // O(1)
            tail = node; // O(1)
        } else {
            Node tempNode = head;  // O(1)
            int index = 0;  // O(1)
            while (index < location - 1) { // O(N)
                tempNode = tempNode.next; // O(1)
                index++; // O(1)
            }
            Node nextNode = tempNode.next; // O(1)
            tempNode.next = node; // O(1)
            node.next = nextNode; // O(1)
        }
        size++; // O(1)
    }




}
