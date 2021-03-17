package DynamicArrayHW;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTests extends Assertions {

    @Test
    public void getSize_size0_size1() {

        Queue<Integer> queue = new Queue<>();

        queue.enQueue(5);

        assertEquals(1, queue.getSize());
    }

    @Test
    public void getSize_size1_size0() {

        Queue<Integer> queue = new Queue<>();

        queue.enQueue(5);
        queue.deQueue();

        assertEquals(0, queue.getSize());
    }

    @Test
    public void enQueue_emptyArr_adds5() {

        Queue<Integer> queue = new Queue<>();

        queue.enQueue(5);

        assertEquals(5, queue.peek());
    }

    @Test
    public void deQueue_removesFront_frontIs7() {

        Queue<Integer> queue = new Queue<>();

        queue.enQueue(7);
        queue.enQueue(8);
        queue.deQueue();

        assertEquals(7, queue.peek());
    }

    @Test
    public void enQueue_fullQueue_throwsExc() {

        Queue<Integer> queue = new Queue<>();

        queue.enQueue(0);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);

        assertThrows(RuntimeException.class, () -> queue.enQueue(9));
    }
}
