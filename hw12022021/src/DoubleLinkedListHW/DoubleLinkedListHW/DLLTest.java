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

//    @Test
//    public void addByIndex_addNewValue_adds5at2() {
//
//        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
//
//        doubleLinkedList.addFirst(1);
//        doubleLinkedList.addByIndex(1, 8);
//        doubleLinkedList.addByIndex(2,5);
//
//        assertEquals(1, doubleLinkedList.getByIndex(0));
//    }

    @Test
    public void getSize_size0_size1() {

        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        doubleLinkedList.addFirst(5);

        assertEquals(1, doubleLinkedList.getSize());
    }

    @Test
    public void getSize_size0_size2() {

        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();

        doubleLinkedList.addFirst(5);
        doubleLinkedList.addLast(8);

        assertEquals(2, doubleLinkedList.getSize());
    }

}
