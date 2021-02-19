package DynamicArrayHW;

public class DynamicArray <T> {

    private int DEFAULT_SIZE = 15;

    private T[] dataArr;

    public DynamicArray() {
        dataArr = (T[]) new Object[DEFAULT_SIZE];
    }

    public DynamicArray(int size){
        if (size > -1)
            dataArr = (T[]) new Object[size];
        else
            throw new RuntimeException("Negative Array Size");
    }

    public 


//    public T getVal(int index) {
//        if ()
//    }
}
