import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * Created by OleksiiF on 17.04.2018.
 */


public class MArrayList<E> extends ArrayList<E>{

    private final Object lock = new Object();

    //It is logically impossible for two threads to access the constructor of the same object.
    public MArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public MArrayList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public void trimToSize() {
        synchronized (lock) {
            super.trimToSize();
        }
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        synchronized (lock) {
            super.ensureCapacity(minCapacity);
        }
    }

    @Override
    public int size() {
        synchronized (lock) {
            return super.size();
        }
    }

    @Override
    public boolean isEmpty() {
        synchronized (lock) {
            return super.isEmpty();
        }
    }

    @Override
    public boolean contains(Object o) {
        {
            return super.contains(o);
        }
    }

    @Override
    public int indexOf(Object o) {
        synchronized (lock) {
            return super.indexOf(o);
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        synchronized (lock) {
            return super.lastIndexOf(o);
        }
    }

    @Override
    public Object clone() {
        synchronized (lock) {
            return super.clone();
        }
    }

    @Override
    public Object[] toArray() {
        synchronized (lock) {
            return super.toArray();
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        synchronized (lock) {
            return super.toArray(a);
        }
    }

    @Override
    public E get(int index) {
        synchronized (lock) {
            return super.get(index);
        }
    }

    @Override
    public E set(int index, E element) {
        synchronized (lock) {
            return super.set(index, element);
        }
    }

    @Override
    public boolean add(E e) {
        synchronized (lock) {
            return super.add(e);
        }
    }

    @Override
    public void add(int index, E element) {
        synchronized (lock) {
            super.add(index, element);
        }
    }

    @Override
    public E remove(int index) {
        synchronized (lock) {
            return super.remove(index);
        }
    }

    @Override
    public boolean remove(Object o) {
        synchronized (lock) {
            return super.remove(o);
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        synchronized (lock) {
            return super.containsAll(c);
        }
    }

    @Override
    public void clear() {
        synchronized (lock) {
            super.clear();
        }
    }

    @Override
    public String toString() {
        synchronized (lock) {
            return super.toString();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        synchronized (lock) {
            super.finalize();
        }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        synchronized (lock) {
            return super.addAll(c);
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        synchronized (lock) {
            return super.addAll(index, c);
        }
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        synchronized (lock) {
            super.removeRange(fromIndex, toIndex);
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        synchronized (lock) {
            return super.removeAll(c);
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        synchronized (lock) {
            return super.retainAll(c);
        }
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        synchronized (lock) {
            return super.listIterator(index);
        }
    }

    @Override
    public ListIterator<E> listIterator() {
        synchronized (lock) {
            return super.listIterator();
        }
    }

    @Override
    public Iterator<E> iterator() {
        synchronized (lock) {
            return super.iterator();
        }
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        synchronized (lock) {
            return super.subList(fromIndex, toIndex);
        }
    }

    @Override
    public boolean equals(Object o) {
        synchronized (lock) {
            return super.equals(o);
        }
    }

    @Override
    public int hashCode() {
        synchronized (lock) {
            return super.hashCode();
        }
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        synchronized (lock) {
            super.forEach(action);
        }
    }

    @Override
    public Spliterator<E> spliterator() {
        synchronized (lock) {
            return super.spliterator();
        }
    }

    @Override
    public Stream<E> stream() {
        return null;
    }

    @Override
    public Stream<E> parallelStream() {
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        synchronized (lock) {
            return super.removeIf(filter);
        }
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        synchronized (lock) {
            super.replaceAll(operator);
        }
    }

    @Override
    public void sort(Comparator<? super E> c) {
        synchronized (lock) {
            super.sort(c);
        }
    }
}
