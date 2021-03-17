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
        size++;
        if (fullQueue()) {
            throwsFullQueue();
        }

        rear++;
        if(rear >= getCapacity() && size != getCapacity()){
            rear = 0;
        }
        if (size == 0 || size == 1) {
            front = rear;
        }
        dynamicArray.setVal(rear, data);
    }

    public void deQueue() {
        if (emptyQueue()) {
            throwsEmptyQueue();
        }

        front++;

        if(front > getCapacity() - 1){
            front = 0;
        }
        if ()
            
        size--;
    }


    public T peek() {
        return dynamicArray.getVal(front);
    }
}
