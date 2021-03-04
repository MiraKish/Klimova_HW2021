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

    public void getByIndex(int index) {
        
    }

    public void addByIndex(int index, T data) {
        DoubleLinkedListElement oldEl = head;

        while (oldEl != null && count != index) {
            oldEl = oldEl.next;
            count++;
        }

        DoubleLinkedListElement element = new DoubleLinkedListElement(null, data, head);

        oldEl.previous.next = element;
        element.previous = oldEl.previous;
        oldEl.previous = oldEl;
        element.next = oldEl;
    }

}
