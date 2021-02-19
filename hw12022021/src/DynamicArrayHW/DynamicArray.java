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

    public int size() {
        return dataArr.length;
    }

    public void throwsException() {
        throw new ArithmeticException("Wrong");
    }

    public void setVal(int index, T value) {
        if (size() <= index || index < 0)
            throwsException();
        else
            dataArr[index] = value;
    }

    public T getVal(int index) {
        if (size() <= index && index < 0)
            throwsException();
        return dataArr[index];
    }



}
