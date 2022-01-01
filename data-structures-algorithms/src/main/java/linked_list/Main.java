package linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.create(5);
        singlyLinkedList.insertNode(3, 0);
        singlyLinkedList.insertNode(2, 1);
        singlyLinkedList.insertNode(4, 2);
        System.out.println(singlyLinkedList.size);
        System.out.println(singlyLinkedList.head.value);
        System.out.println(singlyLinkedList.head.next.value);
        singlyLinkedList.traverseList();
        singlyLinkedList.searchNode(2);
    }
}
