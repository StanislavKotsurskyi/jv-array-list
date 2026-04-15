package core.basesyntax;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayList<T> implements List<T> {
    private static final int START_INDEX = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private T[] elementData;
    private int size;

    public ArrayList() {
        elementData = (T[]) new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public void add(T value) {
        if (size >= capacity) {
            grow();
        }
        elementData[size] = value;
        size++;
    }

    @Override
    public void add(T value, int index) {
        if (index > size || index < START_INDEX) {
            throw new ArrayListIndexOutOfBoundsException("index %s out of bounds for length %s"
                    .formatted(index, size));
        }
        if (size >= capacity) {
            grow();
        }
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = value;
        size++;

    }

    @Override
    public void addAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    @Override
    public void set(T value, int index) {
        checkIndex(index);

        elementData[index] = value;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        T value = elementData[index];
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        size--;
        return value;
    }

    @Override
    public T remove(T element) {
        int index = 0;
        for (T elementDatum : elementData) {
            if (Objects.equals(elementDatum, element)) {
                T value = elementData[index];
                System.arraycopy(elementData, index + 1, elementData, index, size - index);
                size--;
                return value;
            }
            index++;
        }
        throw new NoSuchElementException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }

    private void grow() {
        capacity += capacity / 2;
        elementData = Arrays.copyOf(elementData, capacity);
    }

    private void checkIndex(int index) {
        if (index > size - 1 || index < START_INDEX) {
            throw new ArrayListIndexOutOfBoundsException("index %s out of bounds for length %s"
                    .formatted(index, size));
        }
    }
}
