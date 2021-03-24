package DoubleLinkedListHW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DequeTests extends Assertions {

    @Test
    public void pushBack_addsNewTail_tailEquals6() {

        Deque<String> deque = new Deque<>();

        deque.pushBack("6");

        assertEquals("6", deque.getTail());
    }

    @Test
    public void popBack_getsOldTail_oldTailEquals6() {

        Deque<String> deque = new Deque<>();

        deque.pushBack("6");

        assertEquals("6", deque.popBack());
    }

    @Test
    public void popBack_removesTail_tailEqualsNull() {

        Deque<String> deque = new Deque<>();

        deque.pushBack("6");
        deque.popBack();

        assertEquals(null, deque.getTail());
    }

    @Test
    public void popBack_emptyList_throwsException() {

        Deque<String> deque = new Deque<>();

        assertThrows(RuntimeException.class, () -> deque.popBack());
    }

    
}