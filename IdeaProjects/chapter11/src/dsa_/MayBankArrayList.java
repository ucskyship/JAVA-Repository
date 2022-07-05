package dsa_;

import java.util.Arrays;

public class MayBankArrayList implements MayBankList {
    private String [] elements = new String[10];
    private int size;
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
       elements[size++] = item;
    }

    @Override
    public void delete(String item) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(item)) {
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
        System.out.println("The item at this index is " + elements[index]);
        return elements[index];
    }

    @Override
    public int capacity()  {
        return elements.length;
    }

    @Override
    public void deleteFromAParticularIndex(int indexOfItem) {
        for (String element : elements) {
            elements[indexOfItem] = null;
            System.out.println(element);
        }
    }
}
