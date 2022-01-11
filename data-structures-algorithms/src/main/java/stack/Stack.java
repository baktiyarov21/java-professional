package stack;

public interface Stack {
    void push(int value);
    int pop();
    boolean isEmpty();
    boolean isFull();
    void deleteStack();
    int peek();
}
