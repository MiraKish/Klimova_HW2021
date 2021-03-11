package DoubleLinkedListHW;

public class StackDLL <T> {
//    private T dataTop;
    private int top = -1;
//    private int size = 7;
    private int DEFAULT_SIZE = 7;
    private int actualSize = 0;

    DoubleLinkedList<T> doubleLinkedList = new DoubleLinkedList<>();

    private String stackIsFull = "Too many items in a stack";
    private String emptyStack = "Stack is empty";

    private void throwsStackIsFull() {
        throw new RuntimeException(stackIsFull);
    }

    private void throwsEmptyStack() {
        throw new RuntimeException(emptyStack);
    }

    public StackDLL() {
        DoubleLinkedList<T> doubleLinkedList = new DoubleLinkedList<>();
//        dataTop = dataStack.getHead();
    }

    public int getSize() {
        return doubleLinkedList.getSize();
    }

    public boolean emptyStack() {
        return doubleLinkedList.emptyList();
    }

    public void push(T data) {
        top++;
        if (top == DEFAULT_SIZE)
            throwsStackIsFull();
        doubleLinkedList.addLast(data);
        actualSize++;
    }

    public T peek() {
        return doubleLinkedList.getTail();
    }

    public T pop() {
        if (emptyStack())
            throwsEmptyStack();

        T element = doubleLinkedList.getTail();
        doubleLinkedList.removeLast();
        top--;
        actualSize--;
        return element;
    }
}