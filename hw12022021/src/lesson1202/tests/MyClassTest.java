package lesson1202.tests;

import lesson1202.code.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassTest extends Assertions {

    @Test
    public  void firstTest() {
        // prepare
        // Action
        // Check

        MyClass myClass = new MyClass();

        int result = myClass.add(10);

        assertEquals(11, result);
    }

    // how to name Tests
    // <Имя тестируемого метода>_<ситуация(какая ситуация тестируется, например, попытка удалить из пустого массива)>_<ожидаемый результат>

    @Test
    public void secondTest() {
        MyClass myClass = new MyClass();

        Throwable result = assertThrows(ArithmeticException.class, () -> myClass.throwsException());

        assertEquals("Test exception", result.getMessage());
    }
}
