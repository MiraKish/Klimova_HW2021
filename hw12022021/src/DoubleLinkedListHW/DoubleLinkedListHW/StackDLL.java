package DoubleLinkedListHW;

public class StackDLL <T> {
    DoubleLinkedList<T> doubleLinkedList = new DoubleLinkedList<>();

    public int getSize() {
        return doubleLinkedList.getSize();
    }

    public boolean emptyStack() {
        return doubleLinkedList.emptyList();
    }

    

}
