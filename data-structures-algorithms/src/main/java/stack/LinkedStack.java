package stack;

import linked_list.SinglyLinkedList;

public class LinkedStack implements Stack {
    SinglyLinkedList list;

    public LinkedStack() {
        this.list = new SinglyLinkedList();
    }

    @Override
    public void push(int value) {
        list.insertNode(value, 0); // O(N)
        System.out.println(value + " inserted"); // O(1)
    }

    @Override
    public int pop() {
        int result;// O(1)
        if (isEmpty()) {// O(1)
            System.out.println("The stack is empty");// O(1)
            return -1;// O(1)
        } else {
            result = list.head.value;// O(1)
            list.deleteNode(0);// O(1)
        }
        return result;// O(1)
    }

    @Override
    public boolean isEmpty() {
        return list.size == 0; // O(1)
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void deleteStack() {
        list = null; // O(1)
        System.out.println("The stack successfully deleted"); // O(1)
    }

    @Override
    public int peek() {
        if (isEmpty()) {// O(1)
            System.out.println("The stack is empty");// O(1)
            return -1;// O(1)
        } else {
            return list.head.value;// O(1)
        }
    }
}
