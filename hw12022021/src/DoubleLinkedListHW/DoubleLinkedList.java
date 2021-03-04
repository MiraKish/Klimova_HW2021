package DoubleLinkedListHW;

public class DoubleLinkedList <T> {
    private DoubleLinkedListElement head;
    private DoubleLinkedListElement tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void throwException() {
        throw new RuntimeException();
    }

    public int getSize() {
        return size;
    }

    public int emptyList() {
        size = 0;
        return size;
    }


}
