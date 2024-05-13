package thinkingInObjects;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private int capacity;

    public StackOfIntegers() {
        this(16);
    }

    public StackOfIntegers(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        if (size >= capacity) {
            int[] newElements = new int[(size + 1) * 2];
            capacity = (size + 1)*2;
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}
