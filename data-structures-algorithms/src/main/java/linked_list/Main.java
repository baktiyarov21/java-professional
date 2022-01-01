package linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLinkedList(5);
        singlyLinkedList.insertToLinkedList(3, 0);
        singlyLinkedList.insertToLinkedList(2, 1);
        System.out.println(singlyLinkedList.size);
        System.out.println(singlyLinkedList.head.value);
        System.out.println(singlyLinkedList.head.next.value);
    }
}
