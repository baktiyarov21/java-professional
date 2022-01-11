package stack;

public class ArrayStack implements Stack{
    int[] arr;
    int topOfStack;

    public ArrayStack(int size) {
        this.arr = new int[size]; // O(1)
        this.topOfStack = -1; // O(1)
        System.out.println("The size of stack is: " + size); // O(1)
    }


    @Override
    public void push(int value) {
        if (isFull()) { // O(1)
            System.out.println("The stack is full"); // O(1)
        } else {
            arr[topOfStack + 1] = value; // O(1)
            topOfStack++; // O(1)
            System.out.println(value + " successfully inserted"); // O(1)
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) { // O(1)
            System.out.println("The is empty"); // O(1)
            return -1; // O(1)
        } else {
            int top = arr[topOfStack]; // O(1)
            topOfStack--; // O(1)
            return top; // O(1)
        }
    }

    @Override
    public boolean isEmpty() {
        return topOfStack == -1;  // O(1)
    }

    @Override
    public boolean isFull() {
        if (topOfStack == arr.length - 1) { // O(1)
            System.out.println("The stack is full"); // O(1)
            return true;
        }
        return false;
    }

    @Override
    public void deleteStack() {
        arr = null; // O(1)
        System.out.println("The stack is successfully deleted"); // O(1)
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }
}
