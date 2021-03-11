package DoubleLinkedListHW;

public class StackDLL <T> {
    private DoubleLinkedList<T> dataStack;
    private T top;

    DoubleLinkedList<T> doubleLinkedList = new DoubleLinkedList<>();

    public StackDLL() {
        DoubleLinkedList<T> doubleLinkedList = new DoubleLinkedList<>();
        dataStack = doubleLinkedList;
        top = dataStack.getHead();
    }

    public int getSize() {
        return doubleLinkedList.getSize();
    }

    public boolean emptyStack() {
        return doubleLinkedList.emptyList();
    }

    public void push(T data) {
        top = data;
    }

    

}
