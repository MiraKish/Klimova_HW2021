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


}
