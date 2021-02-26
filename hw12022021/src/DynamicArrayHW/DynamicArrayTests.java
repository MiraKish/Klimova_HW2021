package DynamicArrayHW;

import DynamicArrayHW.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicArrayTests extends Assertions {

    @Test
    public void DynamicArray_setVal_throwsException() {

        DynamicArray dynamicArray = new DynamicArray();
//        dynamicArray.setVal(16, 11);
        assertThrows(ArithmeticException.class, () -> dynamicArray.setVal(16, 12));
    }

    @Test
    public void DynamicArray_getVal_throwsExc() {
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.getVal(16));
    }

    @Test
    public void DynamicArray_setVal_SetsValue() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.setVal(5,12);
        assertEquals(12, dynamicArray.getVal(5));
    }

    @Test
    public void DynamicArray_getVal_GetsValue() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.setVal(5,10);
        dynamicArray.getVal(5);
        assertEquals(10, dynamicArray.getVal(5));
    }

    @Test
    public void DynamicArray_resize_throwsExc() {
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.resize(-1));
    }

    @Test
    public void DynamicArray_resize_getsNewSize() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(10);
        assertEquals(10, dynamicArray.size());
    }

    @Test
    public void DynamicArray_addVal_addsNewValue() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.addVal(1);
        assertEquals(17, dynamicArray.size());
    }

    @Test
    public void DynamicArray_removeVal_removesValue() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(3);

        dynamicArray.setVal(0, 12);
        dynamicArray.setVal(1, 5);
        dynamicArray.setVal(2, 1);
        dynamicArray.removeVal(1);

        assertEquals(2, dynamicArray.size());
    }

    @Test
    public void DynamicArray_removeVal_throwsExc() {
        DynamicArray dynamicArray = new DynamicArray();

        assertThrows(ArithmeticException.class, () -> dynamicArray.removeVal(-2));
    }

    @Test
    public void DynamicArray_findLast_printsIndex() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.setVal(4, 12);
        dynamicArray.setVal(10, 12);
        assertEquals(10, dynamicArray.findLast(12));
    }

    @Test
    public void DynamicArray_findLastWrongValue_returnsMinus1() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(2);
        dynamicArray.setVal(0, 12);
        dynamicArray.setVal(1, 3);

        assertEquals(-1, dynamicArray.findLast(10));
    }

    @Test
    public void DynamicArray_findFirst_printsIndex() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.setVal(4, 12);
        dynamicArray.setVal(10, 12);
        assertEquals(4, dynamicArray.findFirst(12));
    }

    @Test
    public void DynamicArray_findFirstWrongValue_returnsMinus1() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(2);
        dynamicArray.setVal(0, 12);
        dynamicArray.setVal(1, 3);

        assertEquals(-1, dynamicArray.findFirst(10));
    }

    @Test
    public void DynamicArray_insert_addsAtRightIndex() {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.resize(3);
        dynamicArray.setVal(0, 12);
        dynamicArray.setVal(1, 3);
        dynamicArray.setVal(2, 8);

        dynamicArray.insert(10, 1);

        assertEquals(10, dynamicArray.getVal(1));
    }

    @Test
    public void DynamicArray_insert_throwsExc() {
        DynamicArray dynamicArray = new DynamicArray();

        assertThrows(ArithmeticException.class, () -> dynamicArray.insert(14, -1));
    }
}