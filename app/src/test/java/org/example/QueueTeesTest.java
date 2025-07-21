package example.org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTeesTest {

    private QueueTees<Object> queue;

    @BeforeEach
    public void setup() {
        queue = new QueueTees<>();
    }

    @Test
    public void testInitialSize() {
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueueAndSize() {
        queue.enqueue("Hello");
        queue.enqueue(42);
        assertEquals(2, queue.size());
    }

    @Test
    public void testDequeueOrder() {
        queue.enqueue("first");
        queue.enqueue("second");

        assertEquals("first", queue.dequeue());
        assertEquals("second", queue.dequeue());
        assertNull(queue.dequeue());
    }

    @Test
    public void testClear() {
        queue.enqueue("A");
        queue.enqueue("B");
        queue.clear();
        assertEquals(0, queue.size());
        assertNull(queue.dequeue());
    }

    @Test
    public void testQueueMaxSize() {
        for (int i = 0; i < 10; i++) {
            queue.enqueue("Item" + i);
        }
        assertEquals(10, queue.size());

        queue.enqueue("Overflow");
        assertEquals(10, queue.size());
    }

    @Test
    public void testAnyType() {
        queue.enqueue("String");
        queue.enqueue(123);
        queue.enqueue(3.14);

        assertTrue(queue.anyType(String.class));
        assertTrue(queue.anyType(Integer.class));
        assertTrue(queue.anyType(Double.class));
        assertFalse(queue.anyType(Boolean.class));
    }
}
