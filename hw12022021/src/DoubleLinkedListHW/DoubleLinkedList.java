package DoubleLinkedListHW;

public class DoubleLinkedList <T> {
    private DoubleLinkedListElement<T> head;
    private DoubleLinkedListElement<T> tail;
    private int count = 0;
    private int size;

    public String nullPointerExc = "You got Null";

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void throwNullException() {
        throw new RuntimeException(nullPointerExc);
    }

    public int getSize() {
        return size;
    }

    public boolean emptyList() {
        return head == null;
    }

    public T getHead() {
        if (head == null)
            throwNullException();
        return head.data;
    }

    public T getTail() {
        if (tail == null)
            throwNullException();
        return tail.data;
    }

    public T getByIndex(int index) {
        DoubleLinkedListElement<T> oldEl = head;

        while (oldEl != null) {
            if (count == index)
                return oldEl.data;
            oldEl = oldEl.next;
            count++;
        }
        return null;
    }

    public DoubleLinkedListElement<T> addByIndex(int index, T data) {
        DoubleLinkedListElement<T> oldEl = head;

        while (oldEl != null && count != index) {
            oldEl = oldEl.next;
            count++;
        }

        DoubleLinkedListElement element = new DoubleLinkedListElement(tail, data, head);

        oldEl.previous.next = element;
        element.previous = oldEl.previous;
        oldEl.previous = oldEl;
        element.next = oldEl;
        return element;
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

    public DoubleLinkedListElement<T> findByData(T data) {
        DoubleLinkedListElement<T> neededEl = head;

        while (neededEl != null) {
            if (neededEl.data.equals(data))
                return neededEl;
            neededEl = neededEl.next;
        }
        return null;
    }

    public void removeFirst() {
        if (head.next == null)
            tail = null;
        else
            head.next.previous = null;

        head = head.next;
    }

    public void removeLast() {
        if (head.next == null)
            head = null;
        else
            tail.previous.next = null;

        tail = tail.previous;
    }
}
