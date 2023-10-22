public class Container<T> {
    private Object[] elements;
    private int size;
    private int capacity;

    public Container() {
        this.elements = new Object[10];
        this.size = 0;
        this.capacity = 10;
    }

    public void add(T element) {
        if (size >= capacity) {
            int newCapacity = capacity * 2;
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
            capacity = newCapacity;
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public int size() {
        return size;
    }
}