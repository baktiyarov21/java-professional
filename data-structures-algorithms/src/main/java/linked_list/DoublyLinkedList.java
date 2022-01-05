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

    }

    @Override
    public boolean searchNode(int value) {
        return false;
    }

    @Override
    public void deleteNode(int location) {

    }

    @Override
    public void deleteAll() {

    }
}
