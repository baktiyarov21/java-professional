package interview_question;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.create(1);
        linkedList.insertNode(2);
        linkedList.insertNode(2);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        deleteDuplicates(linkedList);
        linkedList.traverse();
    }

    public static void deleteDuplicates(LinkedList linkedList) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node current = linkedList.head;
        Node prev = null;
        while(current != null) {
            int currentVal = current.value;
            if (hashSet.contains(currentVal)) {
                prev.next = current.next;
                linkedList.size--;
            } else {
                hashSet.add(currentVal);
                prev = current;
            }
            current = current.next;
        }
    }

}
