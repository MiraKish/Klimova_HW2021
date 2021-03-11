package DoubleLinkedListHW;

public class DoubleLinkedListElement <T> {
    DoubleLinkedListElement<T> previous;
    T data;
    DoubleLinkedListElement<T> next;

    public DoubleLinkedListElement(DoubleLinkedListElement Previous, T Data, DoubleLinkedListElement Next) {
        previous = Previous;
        data = Data;
        next = Next;
    }
}
