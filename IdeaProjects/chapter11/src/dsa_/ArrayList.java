package dsa_;

import java.util.Objects;

public class ArrayList implements List {
    private int size = 0;
    private int arraySize = 5;
    private String[] elements = new String[arraySize];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        if (size == arraySize - 1) {
            int previousSize = arraySize;
            arraySize *= 2;
            String[] newElements = new String[arraySize];
            System.arraycopy(elements, 0, newElements, 0, previousSize);
            elements = newElements;
        }
        elements[size] = item;
        size++;       // increment can be written as this is you don't want to increment size in the [];
    }

    @Override
    public void delete(String item) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(item, elements[i])) {
                System.arraycopy(elements, i + 1, elements, i, size - i);
            }
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {
        return arraySize;
    }

    public boolean contains(String item) {
        for (String anItem : elements) {
            if (Objects.equals(anItem, item)) {
                return true;
            }
        }
        return false;
    }
}
