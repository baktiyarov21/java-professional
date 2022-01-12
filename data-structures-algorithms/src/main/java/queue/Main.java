package queue;

public class Main {
    public static void main(String[] args) {
        Queue arrayQueue = new ArrayQueue(3);
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.enQueue(1);
        arrayQueue.enQueue(2);
        arrayQueue.enQueue(3);
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.deleteQueue();
    }
}
