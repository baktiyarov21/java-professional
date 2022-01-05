package linked_list;

import linked_list.node.SinglyNode;

public class CircularSinglyLinkedList implements LinkedList {
    public SinglyNode head;
    public SinglyNode tail;
    public int size;

    @Override
    public SinglyNode createList(int nodeValue) {
        head = new SinglyNode(); // O(1)
        SinglyNode singlyNode = new SinglyNode();  // O(1)
        singlyNode.value = nodeValue; // O(1)
        singlyNode.next = singlyNode; // O(1)
        head = singlyNode; // O(1)
        tail = singlyNode; // O(1)
        size = 1; // O(1)
        return head; // O(1)
    }

    @Override
    public void insertNode(int nodeValue, int location) {
        SinglyNode singlyNode = new SinglyNode();// O(1)
        singlyNode.value = nodeValue;// O(1)
        if (head == null) {// O(1)
            createList(nodeValue);// O(1)
        } else if (location == 0) {// O(1)
            singlyNode.next = singlyNode;// O(1)
            head = singlyNode;// O(1)
            tail.next = head;// O(1)
        } else if (location >= size) {// O(1)
            tail.next = singlyNode;// O(1)
            tail = singlyNode;// O(1)
            tail.next = head;// O(1)
        } else {
            SinglyNode tempSinglyNode = head;  // O(1)
            int index = 0;  // O(1)
            while (index < location - 1) { // O(N)
                tempSinglyNode = tempSinglyNode.next; // O(1)
                index++; // O(1)
            }
            singlyNode.next = tempSinglyNode.next;// O(1)
            tempSinglyNode.next = singlyNode;// O(1)
        }
        size++;// O(1)
    }

    @Override
    public void traverseList() {
        if (head != null) {// O(1)
            SinglyNode tempSinglyNode = head;// O(1)
            for (int i = 0; i < size; i++) {// O(N)
                System.out.print(tempSinglyNode.value);// O(1)
                if (i != size - 1) {// O(1)
                    System.out.print(" -> ");// O(1)
                }
                tempSinglyNode = tempSinglyNode.next;// O(1)
            }
        } else {
            System.out.println("List doesnt exists");// O(1)
        }
    }

    @Override
    public boolean searchNode(int value) {
        if (head != null) {
            SinglyNode tempSinglyNode = head; //O(1)
            for (int i = 0; i < size; i++) { // O(N)
                if (tempSinglyNode.value == value) { // O(1)
                    System.out.println("SinglyNode's at location " + i); // O(1)
                    return true; // O(1)
                }
                tempSinglyNode = tempSinglyNode.next; // O(1)
            }
        }
        System.out.println("SinglyNode not found"); // O(1)
        return false; // O(1)
    }

    @Override
    public void deleteNode(int location) {
        if (head == null) { // O(1)
            System.out.println("List doesnt exists"); // O(1)
        } else if (location == 0) { // O(1)
            head = head.next; // O(1)
            tail.next = head; // O(1)
            size--; // O(1)
            if (size == 0) { // O(1)
                tail = null; // O(1)
                head.next = null; // O(1)
                head = null; // O(1)
            }
        } else if (location >= size) {
            SinglyNode tempSinglyNode = head; // O(1)
            for (int i = 0; i < size - 1; i++) { // O(N)
                tempSinglyNode = tempSinglyNode.next; // O(1)
            }
            if (tempSinglyNode == head) { // O(1)
                head.next = null;// O(1)
                head = null;// O(1)
                size = 0; // O(1)
            }
            tempSinglyNode.next = null; // O(1)
            tail = tempSinglyNode; // O(1)
            size--; // O(1)
        } else {
            SinglyNode tempSinglyNode = head; // O(1)
            for (int i = 0; i < location - 1; i++) { // O(N)
                tempSinglyNode = tempSinglyNode.next; // O(1)
            }
            tempSinglyNode.next = tempSinglyNode.next.next; // O(1)
        }
    }

    @Override
    public void deleteAll() {
        if (head == null) { // O(1)
            System.out.println("List doesnt exists"); // O(1)
        } else {
            head = null; // O(1)
            tail = null; // O(1)
            tail.next = null; // O(1)
            System.out.println("List deleted successfully"); // O(1)
        }
    }
}