package DynamicArrayHW;

public class Queue <T> {
    private int front = 0;
    private int rear = 0;
    private int size = 0;


    DynamicArray<T> dynamicArray = new DynamicArray<>();

    private String emptyQueue = "Queue is empty, can't remove value!";
    private String fullQueue = "Queue is full, can't add value!";

    private void throwsEmptyQueue() {
        throw new RuntimeException(emptyQueue);
    }

    private void throwsFullQueue() {
        throw new RuntimeException(fullQueue);
    }

    public boolean emptyQueue() {
        return dynamicArray.emptyArray();
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return dynamicArray.getCapacity();
    }

    public boolean fullQueue(){
        return dynamicArray.fullArray();
    }

    public void enQueue(T data) {
        if (fullQueue()) {
            throwsFullQueue();
        }

        rear++;
        if(rear >= getCapacity() && getSize() != getCapacity()){
            rear = 0;
        }
        dynamicArray.setVal(rear, data);
    }

    public T deQueue() {
        if (emptyQueue()) {
            throwsEmptyQueue();
        }
        T value = dynamicArray.getVal(front);
        front++;

        if(front > getCapacity()) {
            front = 0;
        }
        size--;

        return value;
    }


    public T peek() {
        return dynamicArray.getVal(front);
    }
}
