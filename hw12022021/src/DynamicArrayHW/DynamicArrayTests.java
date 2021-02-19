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
}
