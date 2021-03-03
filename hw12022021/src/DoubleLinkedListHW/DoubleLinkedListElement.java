package DoubleLinkedListHW;

public class DoubleLinkedListElement <T> {
    DoubleLinkedListElement previous;
    T data;
    DoubleLinkedListElement next;

    public DoubleLinkedListElement(DoubleLinkedListElement Previous, T Data, DoubleLinkedListElement Next) {
        previous = Previous;
        data = Data;
        next = Next;
    }
}
