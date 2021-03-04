package DoubleLinkedListHW;

public class DoubleLinkedList <T> {
    private DoubleLinkedListElement head;
    private DoubleLinkedListElement tail;
    private int count = 0;
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

    public boolean emptyList() {
        return head == null;
    }

    public DoubleLinkedListElement<T> getByIndex(int index) {
        DoubleLinkedListElement oldEl = head;

        while (oldEl != null && count != index) {
            oldEl = oldEl.next;
            count++;
        }

        return oldEl;
    }

    public void addByIndex(int index, T data) {
        DoubleLinkedListElement oldEl = head;

        while (oldEl != null && count != index) {
            oldEl = oldEl.next;
            count++;
        }

        DoubleLinkedListElement element = new DoubleLinkedListElement(tail, data, head);

        oldEl.previous.next = element;
        element.previous = oldEl.previous;
        oldEl.previous = oldEl;
        element.next = oldEl;
    }

    public void addFirst(T data) {
        DoubleLinkedListElement element = new DoubleLinkedListElement(tail, data, head);

        if (emptyList())
            tail = element;
        else
            head.previous = element;
        element.next = head;
        head = element;
    }

    public void addLast(T data) {
        DoubleLinkedListElement element = new DoubleLinkedListElement(tail, data, head);

        if (emptyList())
            head = element;
        else
            tail.previous = element;

        element.previous = tail;
        tail = element;
    }
}
