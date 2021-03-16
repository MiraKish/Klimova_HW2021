package DynamicArrayHW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicArrayTests extends Assertions {

    @Test
    public void setVal_size16_throwsException() {

        DynamicArray dynamicArray = new DynamicArray();
//        dynamicArray.setVal(16, 11);
        assertThrows(RuntimeException.class, () -> dynamicArray.setVal(16, 12));
    }

    @Test
    public void getVal_index16_throwsExc() {
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(RuntimeException.class, () -> dynamicArray.getVal(16));
    }

    @Test
    public void setVal_setsNewVal_newValue15() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.setVal(5,12);
        assertEquals(12, dynamicArray.getVal(5));
    }

    @Test
    public void getVal_getsValAtIndex5_Gets10() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.setVal(5,10);
        dynamicArray.getVal(5);
        assertEquals(10, dynamicArray.getVal(5));
    }

    @Test
    public void resize_negativeSize_throwsExc() {
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(RuntimeException.class, () -> dynamicArray.resize(-1));
    }

    @Test
    public void resize_size15_newSize10() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(10);
        assertEquals(10, dynamicArray.size());
    }

//    @Test
//    public void addVal__addsNewValue() {
//        DynamicArrayHW.DynamicArray dynamicArray = new DynamicArrayHW.DynamicArray();
//
//        dynamicArray.addVal(1);
//        assertEquals(17, dynamicArray.size());
//    }

    @Test
    public void removeVal_oldVal5_newVal2() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(3);

        dynamicArray.setVal(0, 12);
        dynamicArray.setVal(1, 5);
        dynamicArray.setVal(2, 1);
        dynamicArray.removeVal(1);

        assertEquals(2, dynamicArray.size());
    }

    @Test
    public void removeVal_negativeIndex_throwsExc() {
        DynamicArray dynamicArray = new DynamicArray();

        assertThrows(RuntimeException.class, () -> dynamicArray.removeVal(-2));
    }

    @Test
    public void findLast_findLast12_getsIndex10() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.setVal(4, 12);
        dynamicArray.setVal(10, 12);
        assertEquals(10, dynamicArray.findLast(12));
    }

    @Test
    public void findLast_wrongValue_returnsMinus1() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(2);
        dynamicArray.setVal(0, 12);
        dynamicArray.setVal(1, 3);

        assertEquals(-1, dynamicArray.findLast(10));
    }

    @Test
    public void findFirst_findFirst12_getsIndex4() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.setVal(4, 12);
        dynamicArray.setVal(10, 12);
        assertEquals(4, dynamicArray.findFirst(12));
    }

    @Test
    public void findFirst_wrongValue_returnsMinus1() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(2);
        dynamicArray.setVal(0, 12);
        dynamicArray.setVal(1, 3);

        assertEquals(-1, dynamicArray.findFirst(10));
    }

    @Test
    public void insert_oldValue3_newValue10() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(3);
        dynamicArray.setVal(0, 12);
        dynamicArray.setVal(1, 3);
        dynamicArray.setVal(2, 8);

        dynamicArray.insert(1, 10);

        assertEquals(10, dynamicArray.getVal(1));
    }

    @Test
    public void insert_negativeIndex_throwsExc() {
        DynamicArray dynamicArray = new DynamicArray();

        assertThrows(RuntimeException.class, () -> dynamicArray.insert(-1, 21));
    }


    // bad tests

    @Test
    public void addVal_size18_newSize19() {
        DynamicArray<Integer> arr = new DynamicArray<>(18);
        arr.addVal(100);
        assertEquals(19, arr.size());
    }

    @Test
    public void findFirst_findExistingFirst_getCorrectIndex() {
        DynamicArray<String> arr = new DynamicArray<>(10);
        for (int i = 0; i < arr.size(); ++i)
        {
            arr.setVal(i, "item_" + i);
        }
        assertEquals(0, arr.findFirst("item_0"));
    }

}