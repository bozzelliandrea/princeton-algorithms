package github.algorithms.data_structure;

import github.algorithms.stack_and_queue.ArrayQueue;
import github.algorithms.stack_and_queue.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ArrayQueueTest {

    private static final Integer value1 = 1;
    private static final Integer value2 = 2;
    private static final Integer value3 = 3;

    private static final Queue<Integer> queue = new ArrayQueue<>();

    @Test
    @Order(1)
    void loadQueue() {
        Assertions.assertTrue(queue.isEmpty());

        queue.enqueue(value1);
        Assertions.assertEquals(value1, queue.peek());

        queue.enqueue(value2);
        Assertions.assertEquals(value1, queue.peek());

        queue.enqueue(value3);
        Assertions.assertEquals(value1, queue.peek());

        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(3, queue.size());

        Assertions.assertEquals(
                Arrays.toString(new Integer[]{1, 2, 3, null, null, null, null, null}),
                queue.toString()
        );
    }

    @Test
    @Order(1)
    void unloadQueue() {
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(3, queue.size());

        Assertions.assertEquals(value1, queue.dequeue());

        Assertions.assertEquals(value2, queue.peek());
        Assertions.assertEquals(value2, queue.dequeue());

        Assertions.assertEquals(value3, queue.peek());
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(value3, queue.dequeue());

        Assertions.assertTrue(queue.isEmpty());
        Assertions.assertEquals(0, queue.size());
    }
}
