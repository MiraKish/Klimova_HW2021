package DoubleLinkedListHW;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DLLTest extends Assertions {

    @Test
    public void DoubleLinkedList_addFirst_addsData() {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addFirst(2);

        assertEquals(2, doubleLinkedList.getHead());
    }

    @Test
    public void DoubleLinkedList_addLast_addsData() {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addLast(5);

        assertEquals(5, doubleLinkedList.getTail());
    }
}
