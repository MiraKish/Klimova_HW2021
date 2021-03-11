package DoubleLinkedListHW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackDLLTest extends Assertions  {

    @Test
    public void push_addsNewPick_tailEquals6() {

        StackDLL<Integer> stackDLL = new StackDLL<>();

        stackDLL.push(6);

        assertEquals(6, stackDLL.peek());
    }
}
