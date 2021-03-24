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

    
}
