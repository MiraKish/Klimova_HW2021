package DoubleLinkedListHW;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DLLTest extends Assertions {

    @Test
    public void addFirst_addsHead_headEquals2() {

        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        doubleLinkedList.addFirst(2);

        assertEquals(2, doubleLinkedList.getHead());
    }

    @Test
    public void addLast_addsTail_tailEquals5() {

        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        doubleLinkedList.addLast(5);

        assertEquals(5, doubleLinkedList.getTail());
    }

    @Test
    public void removeFirst_removesHead_getNull() {

        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        doubleLinkedList.addFirst(5);
        doubleLinkedList.removeFirst();

        assertEquals(null, doubleLinkedList.getHead());
    }


}
