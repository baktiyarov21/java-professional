package linked_list;

import linked_list.node.DoublyNode;
import linked_list.node.Node;


public class DoublyLinkedList implements LinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;


    @Override
    public Node createList(int value) {
        head = new DoublyNode(); //O(1)
        DoublyNode node = new DoublyNode(); //O(1)
        node.value = value; //O(1)
        node.previous = null; //O(1)
        node.next = null; //O(1)
        head = node; //O(1)
        tail = node; //O(1)
        size = 1; //O(1)
        return node; //O(1)
    }

    @Override
    public void insertNode(int value, int location) {
        DoublyNode node = new DoublyNode(); //O(1)
        node.value = value; //O(1)
        if (head == null) { //O(1)
            createList(value); //O(1)
        } else if (location == 0) { //O(1)
            node.next = head; //O(1)
            node.previous = null; //O(1)
            head.previous = node; //O(1)
            head = node; //O(1)
        } else if (location >= size) { //O(1)
            node.next = null; //O(1)
            tail.next = node; //O(1)
            node.previous = tail; //O(1)
            tail = node; //O(1)
        } else {
            DoublyNode tempNode = head; //O(1)
            for (int i = 0; i < location - 1; i++) { //O(N)
                tempNode = tempNode.next; //O(1)
            }
            node.previous = tempNode; //O(1)
            node.next = tempNode.next; //O(1)
            tempNode.next = node; //O(1)
            node.next.previous = node; //O(1)
        }
        size++; //O(1)
    }

    @Override
    public void traverseList() {
        if (head != null) {// O(1)
            DoublyNode doublyNode = head;// O(1)
            for (int i = 0; i < size; i++) {// O(N)
                System.out.print(doublyNode.value);// O(1)
                if (i != size - 1) {// O(1)
                    System.out.print(" -> ");// O(1)
                }
                doublyNode = doublyNode.next;// O(1)
            }
        } else {
            System.out.println("List doesnt exists");// O(1)
        }
    }

    @Override
    public boolean searchNode(int value) {
        if (head != null) {
            DoublyNode tempDoublyNode = head; //O(1)
            for (int i = 0; i < size; i++) { // O(N)
                if (tempDoublyNode.value == value) { // O(1)
                    System.out.println("DoublyNode's at location " + i); // O(1)
                    return true; // O(1)
                }
                tempDoublyNode = tempDoublyNode.next; // O(1)
            }
        }
        System.out.println("DoublyNode not found"); // O(1)
        return false; // O(1)
    }

    @Override
    public void deleteNode(int location) {
        if (head == null) { // O(1)
            System.out.println("List doesnt exists"); // O(1)
        } else if (location == 0) { // O(1)
            if (size == 1) { // O(1)
                head = null; // O(1)
                tail = null; // O(1)
            } else {
                head = head.next; // O(1)
                head.previous = null; // O(1)
            }
            size--;
        } else if (location >= size) { // O(1)
            DoublyNode tempNode = tail.previous; // O(1)
            if (size == 1) { // O(1)
                head = null; // O(1)
                tail = null; // O(1)
            } else {
                tempNode.next = null; // O(1)
                tail = tempNode; // O(1)
            }
            size--;
        } else {
            DoublyNode tempNode = head; // O(1)
            for (int i = 0; i < location - 1; i++) { // O(N)
                tempNode = tempNode.next; // O(1)
            }
            tempNode.next = tempNode.next.next; // O(1)
            tempNode.next.previous = tempNode; // O(1)
        }

    }

    @Override
    public void deleteAll() {
        head = null;
        tail = null;
        System.out.println("List deleted successfully");
    }

    public void reverseTraverse() {
        if (head != null) {// O(1)
            DoublyNode tempDoublyNode = tail;// O(1)
            for (int i = 0; i < size; i++) {// O(N)
                System.out.print(tempDoublyNode.value);// O(1)
                if (i != size - 1) {// O(1)
                    System.out.print(" -> ");// O(1)
                }
                tempDoublyNode = tempDoublyNode.previous;// O(1)
            }
        } else {
            System.out.println("List doesnt exists");// O(1)
        }
    }

}
