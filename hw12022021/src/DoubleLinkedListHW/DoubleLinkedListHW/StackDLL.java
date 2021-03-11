package DoubleLinkedListHW;

public class StackDLL <T> {
//    private T dataTop;
    private int top = -1;
    private int size = 7;
    private int DEFAULT_SIZE = 7;
    private int actualSize = 0;

    DoubleLinkedList<T> doubleLinkedList = new DoubleLinkedList<>();

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
        if (actualSize == DEFAULT_SIZE)
            throwStackIsFull();
        top++;
        doubleLinkedList.addLast(data);
        actualSize++;
    }

    public T peek() {
        return doubleLinkedList.getHead();
    }

}