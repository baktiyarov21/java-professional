package linked_list;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node create(int value) {
        head = new Node(); // O(1)
        Node node = new Node(); // O(1)
        node.next = null; // O(1)
        node.value = value; // O(1)
        head = node; // O(1)
        tail = node; // O(1)
        size = 1; // O(1)
        return head;
    }

    public void insertNode(int value, int location) {
        Node node = new Node(); // O(1)
        node.value = value; // O(1)
        if (head == null) {  // O(1)
            create(value); // O(1)
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

    public void traverseList() {
        if (head == null) { //O(1)
            System.out.println("List doesnt exists"); //O(1)
        } else  { //O(1)
            Node tempNode = head; //O(1)
            for (int i = 0; i < size; i++) { //O(N)
                System.out.print(tempNode.value); //O(1)
                if (i != size - 1) { //O(1)
                    System.out.print("->"); //O(1)
                }
                tempNode = tempNode.next; //O(1)
            }
        }
        System.out.println("\n"); //O(1)
    }

    public boolean searchNode(int value) {
        if (head != null) {
            Node tempNode = head; //O(1)
            for (int i = 0; i < size; i++) { // O(N)
                if (tempNode.value == value) { // O(1)
                    System.out.println("Node's at location " + i); // O(1)
                    return true; // O(1)
                }
                tempNode = tempNode.next; // O(1)
            }
        }
        System.out.println("Node not found"); // O(1)
        return false; // O(1)
    }

    public void deleteNode(int location) {
        if (head == null) { // O(1)
            System.out.println("List doesnt exists"); // O(1)
        } else if (location == 0) { // O(1)
            head = head.next; // O(1)
            size--; // O(1)
            if (size == 0) { // O(1)
                head = null; // O(1)
                tail = null; // O(1)
            }
        } else if (location >= size) { // O(1)
            Node tempNode = head; // O(1)
            for (int i = 0; i < size - 1; i++) { // O(N)
                tempNode = tempNode.next; // O(1)
            }
            if (tempNode == head) { // O(1)
                tail = null; // O(1)
                head = null; // O(1)
                size--; // O(1)
            }
            tempNode.next = null; // O(1)
            tail = tempNode; // O(1)
            size--; // O(1)
        } else {
            Node tempNode = head; // O(1)
            for (int i = 0; i < location - 1; i++) { // O(N)
                tempNode = tempNode.next; // O(1)
            }
            tempNode.next = tempNode.next.next; // O(1)
            size--; // O(1)
        }
    }

    public void deleteAll() {
        head = null;
        tail = null;
        System.out.println("List deleted successfully");
    }




}
