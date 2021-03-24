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

    @Test
    public void peekBack_getsTail_tailEquals8() {

        Deque<String> deque = new Deque<>();

        deque.pushBack("6");
        deque.pushBack("8");

        assertEquals("8", deque.peekBack());
    }

    @Test
    public void pushFront_addsNewHead_headEquals6() {

        Deque<String> deque = new Deque<>();

        deque.pushFront("6");

        assertEquals("6", deque.getHead());
    }

    @Test
    public void popFront_getsOldHead_oldHeadEquals6() {

        Deque<String> deque = new Deque<>();

        deque.pushFront("6");

        assertEquals("6", deque.popFront());
    }

    @Test
    public void popFront_removesHead_headEqualsNull() {

        Deque<String> deque = new Deque<>();

        deque.pushFront("6");
        deque.popFront();

        assertEquals(null, deque.getHead());
    }

    @Test
    public void popFront_emptyList_throwsException() {

        Deque<String> deque = new Deque<>();

        assertThrows(RuntimeException.class, () -> deque.popFront());
    }

    @Test
    public void peekFront_getsHead_headEquals8() {

        Deque<String> deque = new Deque<>();

        deque.pushFront("6");
        deque.pushFront("8");

        assertEquals("8", deque.peekFront());
    }

    @Test
    public void getSize_size0_newSize() {

        Deque<String> deque = new Deque<>();

        deque.pushFront("6");
        deque.pushFront("8");
        deque.pushBack("6");
        deque.pushBack("8");
        deque.popFront();
        deque.popBack();

        assertEquals(2, deque.getSize());
    }

    @Test
    public void peekFront_deletesAndAddsRight_head6() {

        Deque<String> deque = new Deque<>();

        deque.pushFront("6");
        deque.pushFront("8");
        deque.pushBack("7");
        deque.pushBack("9");
        deque.popFront();
        deque.popBack();
        deque.popBack();
        deque.pushBack("10");

        assertEquals("6", deque.peekFront());
    }

    @Test
    public void peekBack_deletesAndAddsRight_tail10() {

        Deque<String> deque = new Deque<>();

        deque.pushFront("6");
        deque.pushFront("8");
        deque.pushBack("7");
        deque.pushBack("9");
        deque.popFront();
        deque.popBack();
        deque.pushBack("10");

        assertEquals("10", deque.peekBack());
    }
}