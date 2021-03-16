package DynamicArrayHW;

public class Queue <T> {
    private int front = 0;
    private int rear = 0;
    private int size = 0;


    DynamicArray<T> dynamicArray = new DynamicArray<>();

//    private String  = " ";
//    private String  = " ";
//
//    private void throws() {
//        throw new RuntimeException();
//    }
//
//    private void throws() {
//        throw new RuntimeException();
//    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return dynamicArray.getCapacity();
    }

    public void enQueue(T data) {
        dynamicArray.setVal(rear, data);
        rear++;
        size++;
    }

    public T deQueue() {
        T value = dynamicArray.getVal(front);
        front++;
        size--;

        return value;
    }

}