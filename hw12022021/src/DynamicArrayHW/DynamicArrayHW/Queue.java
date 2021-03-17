package DynamicArrayHW;

public class Queue <T> {
    private int front = -1;
    private int rear = -1;
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
        } else {
            rear = (rear + 1) % getCapacity();
            dynamicArray.setVal(rear, data);
            size++;

            if (front == -1) {
                front = rear;
            }
        }
    }

    public T deQueue() {
        T element = dynamicArray.getVal(front);
        if (emptyQueue()) {
            throwsEmptyQueue();
        } else {
            dynamicArray.setVal(front, null);
            front = (front + 1) % getCapacity();
            size--;
        }
        return  element;
    }

    public T peek() {
        return dynamicArray.getVal(front);
    }
}
