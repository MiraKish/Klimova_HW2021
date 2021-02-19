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
}