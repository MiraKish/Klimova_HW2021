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
}