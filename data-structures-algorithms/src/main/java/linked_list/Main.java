package linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createList(5);
        singlyLinkedList.insertNode(3, 0);
        singlyLinkedList.insertNode(2, 1);
        singlyLinkedList.insertNode(4, 2);
        System.out.println(singlyLinkedList.size);
        System.out.println(singlyLinkedList.head.value);
        System.out.println(singlyLinkedList.head.next.value);
        singlyLinkedList.searchNode(2);
        singlyLinkedList.deleteNode(2);
        singlyLinkedList.traverseList();
        singlyLinkedList.deleteAll();
        singlyLinkedList.traverseList();

        CircularSinglyLinkedList circularList = new CircularSinglyLinkedList();
        circularList.createList(2);
        System.out.println(circularList.head.value);
        System.out.println(circularList.head.next.value);
        circularList.insertNode(4,2);
        circularList.insertNode(21,3);
        System.out.println(circularList.head.next.value);
        circularList.traverseList();
        circularList.deleteNode(3);
        System.out.println();
        circularList.traverseList();

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createList(3);
        doublyLinkedList.insertNode(4, 2);
        doublyLinkedList.insertNode(5, 3);
        System.out.println();
        doublyLinkedList.reverseTraverse();
    }
}
