package queue;

public interface Queue {
    boolean isFull();
    boolean isEmpty();
    void enQueue(int value);
    int deQueue();
    int peek();
    void deleteQueue();
}
