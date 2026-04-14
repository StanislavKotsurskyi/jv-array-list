package core.basesyntax;

public class ArrayList<T> implements List<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] elementData;
    private int size;

    @Override
    public void add(int index, T value) {
        if (elementData.length == size) {
            elementData = ;
        }
        elementData[index] = value;
        size = size + 1;
    }

    @Override
    public void add(T value, int index) {

    }

    @Override
    public void addAll(List<T> list) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void set(T value, int index) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T remove(T element) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
