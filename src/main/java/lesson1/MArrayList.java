package lesson1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * Created by OleksiiF on 17.04.2018.
 */


public class MArrayList<E> extends ArrayList<E>{

    //private final Object lock = new Object();

    //It is logically impossible for two threads to access the constructor of the same object.


    public MArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public MArrayList() {
        super();
    }

    public MArrayList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public void trimToSize() {
        synchronized (this) {
            super.trimToSize();
        }
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        synchronized (this) {
            super.ensureCapacity(minCapacity);
        }
    }

    @Override
    public int size() {
        synchronized (this) {
            return super.size();
        }
    }

    @Override
    public boolean isEmpty() {
        synchronized (this) {
            return super.isEmpty();
        }
    }

    @Override
    public boolean contains(Object o) {
        synchronized (this) {
            return super.contains(o);
        }
    }

    @Override
    public int indexOf(Object o) {
        synchronized (this) {
            return super.indexOf(o);
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        synchronized (this) {
            return super.lastIndexOf(o);
        }
    }

    @Override
    public Object clone() {
        synchronized (this) {
            return super.clone();
        }
    }

    @Override
    public Object[] toArray() {
        synchronized (this) {
            return super.toArray();
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        synchronized (this) {
            return super.toArray(a);
        }
    }

    @Override
    public E get(int index) {
        synchronized (this) {
            return super.get(index);
        }
    }

    @Override
    public E set(int index, E element) {
        synchronized (this) {
            return super.set(index, element);
        }
    }

    @Override
    public boolean add(E e) {
        synchronized (this) {
            return super.add(e);
        }
    }

    @Override
    public void add(int index, E element) {
        synchronized (this) {
            super.add(index, element);
        }
    }

    @Override
    public E remove(int index) {
        synchronized (this) {
            return super.remove(index);
        }
    }

    @Override
    public boolean remove(Object o) {
        synchronized (this) {
            return super.remove(o);
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        synchronized (this) {
            return super.containsAll(c);
        }
    }

    @Override
    public void clear() {
        synchronized (this) {
            super.clear();
        }
    }

    @Override
    public String toString() {
        synchronized (this) {
            return super.toString();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        synchronized (this) {
            super.finalize();
        }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        synchronized (this) {
            return super.addAll(c);
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        synchronized (this) {
            return super.addAll(index, c);
        }
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        synchronized (this) {
            super.removeRange(fromIndex, toIndex);
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        synchronized (this) {
            return super.removeAll(c);
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        synchronized (this) {
            return super.retainAll(c);
        }
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        synchronized (this) {
            return super.listIterator(index);
        }
    }

    @Override
    public ListIterator<E> listIterator() {
        synchronized (this) {
            return super.listIterator();
        }
    }

    @Override
    public Iterator<E> iterator() {
        synchronized (this) {
            return super.iterator();
        }
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        synchronized (this) {
            return super.subList(fromIndex, toIndex);
        }
    }

    @Override
    public boolean equals(Object o) {
        synchronized (this) {
            return super.equals(o);
        }
    }

    @Override
    public int hashCode() {
        synchronized (this) {
            return super.hashCode();
        }
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        synchronized (this) {
            super.forEach(action);
        }
    }

    @Override
    public Spliterator<E> spliterator() {
        synchronized (this) {
            return super.spliterator();
        }
    }

    @Override
    public Stream<E> stream() {
        synchronized (this) {
            return null;
        }
    }

    @Override
    public Stream<E> parallelStream() {
        synchronized (this) {
            return null;
        }
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        synchronized (this) {
            return super.removeIf(filter);
        }
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        synchronized (this) {
            super.replaceAll(operator);
        }
    }

    @Override
    public void sort(Comparator<? super E> c) {
        synchronized (this) {
            super.sort(c);
        }
    }
}
