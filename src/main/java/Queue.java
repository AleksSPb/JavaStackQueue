import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * Очередь: FIFO = First Input First Output
 */
public class Queue<T>  implements Iterable<T>{
    /**
     * head - начало списка
     * tail - конец списка
     */
    Element<T> head=null, tail=null;

    public Iterator<T> iterator() {
        return new MyIterator();
    }

    /**
     * Добавить в конец очереди
     *
     * @param v значение
     */
    public void put(T value) {
        // TODO: реализовать
        Element<T> newElement = new Element<T>(value);

        if (tail==null) {
            head=tail=newElement;
            return;
        }
        tail.next=newElement;
        tail=newElement;
    }

    /**
     * Взять из начала очереди
     *
     * @return значение
     */
    public T get() {
        // TODO: реализовать

        if (head!=null) {
            Element<T> newElement = head;
            head=head.next;
            return newElement.value;}
        throw new NoSuchElementException("Пустая очередь");
    }


    /**
     * Элемент очереди
     */
   public static class Element<T> {
        T value;
        Element next=null;

        public Element(T value) {
            this.value = value;
        }
    }

    public class MyIterator implements Iterator<T> {
        private Element<T> cur;

        public MyIterator() {
            this.cur=head;
        }

        public boolean hasNext() {
            return cur!=null;
        }

        public T next() {
            if (cur == null)
                throw new IndexOutOfBoundsException("Список кончился");
            T value = cur.value;
            cur = cur.next;
            return value;
        }
    }
}
