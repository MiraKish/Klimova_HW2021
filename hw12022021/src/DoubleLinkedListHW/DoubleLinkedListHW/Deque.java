package DoubleLinkedListHW;

public class Deque <T> {
    private int actualSize = 0;

    DoubleLinkedList<T> doubleLinkedList = new DoubleLinkedList<>();

    private String emptyDeque = "Stack is empty";

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

    public void pushBack(T value) {
        doubleLinkedList.addLast(value);
        actualSize++;
    }

    public T popBack() {
        if (emptyDeque()) {
            throwsEmptyDeque();
        }
        T element = doubleLinkedList.getTail();
        doubleLinkedList.removeLast();
        actualSize--;
        return element;
    }

    public T peekBack() {
        return getTail();
    }

    public void pushFront(T value) {
        doubleLinkedList.addFirst(value);
        actualSize++;
    }

    public T popFront() {
        if (emptyDeque()) {
            throwsEmptyDeque();
        }
        T element = doubleLinkedList.getHead();
        doubleLinkedList.removeFirst();
        actualSize--;
        return element;
    }

    public T peekFront() {
        return  getHead();
    }

    public int getSize() {
        return actualSize;
    }
}
