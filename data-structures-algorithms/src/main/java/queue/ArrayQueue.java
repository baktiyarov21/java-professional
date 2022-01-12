package queue;

public class ArrayQueue implements Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public ArrayQueue(int size) {
        this.arr = new int[size]; // O(1)
        this.topOfQueue = -1; // O(1)
        this.beginningOfQueue = -1; // O(1)
        System.out.println("The queue is created with size: " + size); // O(1)
    }


    @Override
    public boolean isFull() {
        return topOfQueue == arr.length - 1; // O(1)
    }

    @Override
    public boolean isEmpty() {
        return beginningOfQueue == -1; // O(1)
    }

    @Override
    public void enQueue(int value) {
        if (isFull()) { // O(1)
            System.out.println("The queue is full"); // O(1)
        } else if (isEmpty()) { // O(1)
            beginningOfQueue = 0; // O(1)
            topOfQueue++; // O(1)
            arr[topOfQueue] = value; // O(1)
            System.out.println(value + " is successfully inserted"); // O(1)
        } else {
            topOfQueue++; // O(1)
            arr[topOfQueue] = value; // O(1)
            System.out.println(value + " is successfully inserted"); // O(1)
        }
    }

    @Override
    public int deQueue() {
        if (isEmpty()) { // O(1)
            System.out.println("The queue is empty"); // O(1)
            return -1; // O(1)
        } else {
            int result = arr[beginningOfQueue]; // O(1)
            beginningOfQueue++; // O(1)
            if (beginningOfQueue > topOfQueue) { // O(1)
                beginningOfQueue = -1; // O(1)
                topOfQueue = -1; // O(1)
            }
            return result; // O(1)
        }
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty"); // O(1)
            return -1; // O(1)
        } else {
            return arr[beginningOfQueue];
        }
    }

    @Override
    public void deleteQueue() {
        arr = null;
        System.out.println("The is deleted");
    }
}
