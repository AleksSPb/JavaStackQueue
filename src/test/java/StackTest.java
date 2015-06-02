import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

/**
 * Тестирование стека
 */
public class StackTest {

    /**
     * Стек с целыми числами
     */
    @Test
    public void testIntStack() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
    }

    /**
     * Стек со строками
     */
    @Test
    public void testStringStack() {
        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("world");
        assertEquals("world", stack.pop());
        assertEquals("Hello", stack.pop());
    }

    /**
     * Стек пуст и мы пытаемся из него вытащить значение
     */
    @Test(expected = EmptyStackException.class)
    public void testEmptyStack() {
        class MyClass {
        }
        Stack<MyClass> stack = new Stack<MyClass>();
        stack.pop();
    }
}
