package DynamicArrayHW;

public class DynamicArray <T> {

    private int currentSize = 0;
    private int capacity = 15;
    private T[] dataArr;
    private int queueSize = 0;

    private String wrongIndexExc = "Negative index";
    private String outOfBordersExc = "Going beyond the array borders";
    private String negativeSizeExc = "Negative size of the array";

    public DynamicArray() {
        dataArr = (T[]) new Object[capacity];
    }

    public DynamicArray(int size){
        if (size > -1)
            dataArr = (T[]) new Object[size];
        else
            throwsNegativeSizeExc();
    }

    public int size() {
        return currentSize;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean emptyArray() {
        if (currentSize == 0)
            return true;
        return false;
    }

    public boolean fullArray(){
        return size() == getCapacity();
    }

    private void throwsNegativeSizeExc() {
        throw new RuntimeException(negativeSizeExc);
    }

    private void throwsBordersExc() {
        throw new RuntimeException(outOfBordersExc);
    }

    private void throwsWrongIndexExc() {
        throw new RuntimeException(wrongIndexExc);
    }

    public void setVal(int index, T value) {
        if (capacity <= index || index < 0)
            throwsBordersExc();
        else
            dataArr[index] = value;
        currentSize++;
    }

    public T getVal(int index) {
        if (capacity <= index || index < 0)
            throwsBordersExc();
        return dataArr[index];
    }

    public void resize(int newSize) {
        if (newSize <= 0) {
            throwsNegativeSizeExc();
        }

        T[] newArray = dataArr.clone();
        dataArr = (T[])new Object[newSize];

        if (newSize >= 0) {
            System.arraycopy(dataArr, 0, newArray, 0, newSize);
        }
    }

    // магия. не трогать
    public void addVal(T value) {
        if (size() + 1 >= capacity)
            capacity = 17;
        else
            capacity *= 2; // увеличиваем вдвое

        T[] newArr = (T[]) new Object[capacity];

        for (int i = 0; i < size(); i++)
            newArr[i] = dataArr[i];
        dataArr = newArr;
        currentSize++;
    }

    public void removeVal(int index) {
        if (index >= capacity || index < 0)
            throwsBordersExc();

        T[] newArr = (T[]) new Object[size() - 1];

        for (int i = 0; i < index; i++) // до удаленного
            newArr[i] = getVal(i);
        for (int i = index + 1; i < size(); i++) // смещаем на место удаленного идущие за ним значения
            newArr[i - 1] = getVal(i);
        dataArr = newArr;
        currentSize--;
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

    public void insert(int index, T value) {
        if (index < 0)
            throwsWrongIndexExc();
        if (index == capacity) // если capacity равна индексу, то процесс равносилен addVal()
            addVal(value);
        else
            dataArr[index] = value;
        currentSize++;
    }
}


