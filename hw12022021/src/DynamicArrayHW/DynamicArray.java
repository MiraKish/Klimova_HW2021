package DynamicArrayHW;

import java.util.Arrays;

public class DynamicArray <T> {

    private int DEFAULT_SIZE = 15;
    private int capacity = 16;
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
    }

    public void addVal(T value) {
        if (size() + 1 >= capacity)
            capacity = 17;
        else
            capacity *= 2; // увеличиваем вдвое
        T[] newArr = (T[]) new Object[capacity];
        for (int i = 0; i < size(); i++)
            newArr[i] = dataArr[i];
        dataArr = newArr;
    }

    public void removeVal(int index) {
        if (index > capacity && index < 0)
            throwsException();
//            capacity = 17;
//        else
//            capacity *= 2;

        T[] newArr = (T[]) new Object[capacity - 1];
        for (int i = 0; i < index; i++)
            newArr[i] = getVal(i);
        for (int i = 0; i < size(); i++)
            newArr[i] = getVal(i + 1);
        dataArr = newArr;
    }

    public int findLast(T value) {
        for (int i = size() - 1; i > -1; i--) {
            if (dataArr[i] == value)
                return i;
        }
        return -1;
    }

    public int findFirst(T value) {
        for (int i = 0; i < size(); i++) {
            if (dataArr[i] == value)
                return i;
        }
        return -1;
    }


}


