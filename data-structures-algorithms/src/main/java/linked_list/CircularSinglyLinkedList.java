package linked_list;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node create(int nodeValue) {
        head = new Node(); // O(1)
        Node node = new Node();  // O(1)
        node.value = nodeValue; // O(1)
        node.next = node; // O(1)
        head = node; // O(1)
        tail = node; // O(1)
        size = 1; // O(1)
        return head; // O(1)
    }

    public void insertNode(int nodeValue, int location) {
        Node node = new Node();// O(1)
        node.value = nodeValue;// O(1)
        if (head == null) {// O(1)
            create(nodeValue);// O(1)
        } else if (location == 0) {// O(1)
            node.next = node;// O(1)
            head = node;// O(1)
            tail.next = head;// O(1)
        } else if (location >= size) {// O(1)
            tail.next = node;// O(1)
            tail = node;// O(1)
            tail.next = head;// O(1)
        } else {
            Node tempNode = head;  // O(1)
            int index = 0;  // O(1)
            while (index < location - 1) { // O(N)
                tempNode = tempNode.next; // O(1)
                index++; // O(1)
            }
            node.next = tempNode.next;// O(1)
            tempNode.next = node;// O(1)
        }
        size++;// O(1)
    }


    public void traverseList() {
        if (head != null) {// O(1)
            Node tempNode = head;// O(1)
            for (int i = 0; i < size; i++) {// O(N)
                System.out.print(tempNode.value);// O(1)
                if (i != size - 1) {// O(1)
                    System.out.print(" -> ");// O(1)
                }
                tempNode = tempNode.next;// O(1)
            }
        } else {
            System.out.println("List doesnt exists");// O(1)
        }
    }
}
