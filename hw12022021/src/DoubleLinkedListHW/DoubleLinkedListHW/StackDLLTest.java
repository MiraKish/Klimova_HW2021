package DoubleLinkedListHW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackDLLTest extends Assertions  {

    @Test
    public void push_addsNewPick_tailEquals6() {

        StackDLL<Integer> stackDLL = new StackDLL<Integer>();

        stackDLL.push(6);

        assertEquals(6, stackDLL.peek());
    }

    @Test
    public void push_tooManyElements_throwsException() {

        StackDLL<Integer> stackDLL = new StackDLL<Integer>();

        stackDLL.push(6);
        stackDLL.push(6);
        stackDLL.push(6);
        stackDLL.push(6);
        stackDLL.push(6);
        stackDLL.push(6);
        stackDLL.push(6);

        assertThrows(RuntimeException.class, () -> stackDLL.push(8));
    }

    @Test
    public void getSize_size0_size3() {

        StackDLL<Integer> stackDLL = new StackDLL<Integer>();

        stackDLL.push(1);
        stackDLL.push(2);
        stackDLL.push(3);

        assertEquals(3, stackDLL.getSize());
    }

    @Test
    public void pop_returnsNewTop_top1() {

        StackDLL<Integer> stackDLL = new StackDLL<Integer>();

        stackDLL.push(1);
        stackDLL.push(2);
        stackDLL.pop();

        assertEquals(1, stackDLL.peek());
    }

    @Test
    public void pop_emptyList_throwsExc() {

        StackDLL<Integer> stackDLL = new StackDLL<Integer>();

        assertThrows(RuntimeException.class, () -> stackDLL.pop());
    }
}
