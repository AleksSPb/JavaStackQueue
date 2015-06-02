import java.util.EmptyStackException;
/**
 * Стек: LIFO = Last Input First Output
 */
public class Stack<T> {
/**
 *
 */
Element<T> head = null;

    /**
     * Добавить на вершину стека
     *
     * @param v значение
     */
    public void push(T value) {
        // TODO: реализовать
        Element<T> cur = new Element<T>(value);
        if (head==null) {
            head=cur; return;}
        cur.next=head;
        head=cur;
        return;
    }

    /**
     * Получить значение с вершины
     *
     * @return значение
     */
    public T pop() {
        if (head!=null)
        {
            Element<T> cur;
            cur=head;
            head=head.next;
            return cur.value;
        }
        // TODO: реализовать
        throw new EmptyStackException();
    }

    /**
     * Элемент стека
     */
    class Element<T> {
        T value;
        Element<T> next=null;

        public Element(T value){
            this.value=value;
        }
    }
}
