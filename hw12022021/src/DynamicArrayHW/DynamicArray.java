package DynamicArrayHW;

import java.util.Arrays;

public class DynamicArray <T> {

    private int DEFAULT_SIZE = 15;
    private int current = 0;

    private T[] dataArr;

    public DynamicArray() {
        dataArr = (T[]) new Object[DEFAULT_SIZE];
    }

    public DynamicArray(int size){
        if (size > -1)
            dataArr = (T[]) new Object[size];
        else
            throwsException();
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
        if (size() <= index || index < 0)
            throwsException();
        return dataArr[index];
    }

    public void resize(int newSize) {
        if (newSize <= 0) {
            throwsException();
        }

        T[] newArray = dataArr.clone();
        dataArr = (T[])new Object[newSize];

        if (newSize >= 0) {
            System.arraycopy(dataArr, 0, newArray, 0, newSize);
        }

//        for (int i = 0; i < newArray.length; i++) {
//            dataArr[i] = newArray[i];
//        }
    }

    public int capacity(){
        return dataArr.length;
    }

    public void addVal(T value) {

    }
}

