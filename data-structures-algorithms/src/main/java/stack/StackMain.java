package stack;

public class StackMain {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(2);
        arrayStack.push(2);
        arrayStack.push(5);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.isFull());
        arrayStack.deleteStack();


        LinkedStack linkedStack = new LinkedStack();
        System.out.println(linkedStack.isEmpty());
        linkedStack.push(1);
        linkedStack.push(2);
        System.out.println(linkedStack.pop());
        linkedStack.push(3);
        linkedStack.deleteStack();
    }
}
