import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

/**
 * Тестирование очереди
 */
public class QueueTest {

    /**
     * Очередь со строками
     */
    @Test
    public void testStringQueue() {
        Queue<String> queue = new Queue<String>();
        queue.put("Hello");
        queue.put("world");
        assertEquals("Hello", queue.get());
        assertEquals("world", queue.get());
    }

    /**
     * Очередь пуста и мы пытаемся из неё вытащить значение
     */
    @Test(expected = NoSuchElementException.class)
    public void testEmptyQueue() {
        class MyClass {
        }
        Queue<MyClass> queue = new Queue<MyClass>();
        queue.get();
    }
}
