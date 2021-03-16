package DynamicArrayHW;

public class Queue <T> {
    private int front = 0;
    private int rear = 0;


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
        return dynamicArray.size();
    }

    public void enQueue(T data) {
        dynamicArray.setVal(rear, data);
        rear++;
    }

    

}