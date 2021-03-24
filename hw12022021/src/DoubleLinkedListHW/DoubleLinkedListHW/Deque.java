package DoubleLinkedListHW;

public class Deque <T> {
    private int actualSize = 0;

    DoubleLinkedList<T> doubleLinkedList = new DoubleLinkedList<>();

    private String dequeIsFull = "Too many items in a stack";
    private String emptyDeque = "Stack is empty";

    private void throwsDequeIsFull() {
        throw new RuntimeException(dequeIsFull);
    }

    private void throwsEmptyDeque() {
        throw new RuntimeException(emptyDeque);
    }

    public T getHead() {
        return doubleLinkedList.getHead();
    }

    public T getTail() {
        return doubleLinkedList.getTail();
    }

    public boolean emptyDeque() {
        return doubleLinkedList.emptyList();
    }

    public boolean fullDeque() {
        if ()
    }
}
