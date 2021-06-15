import java.util.Arrays;

public class MyArrayList implements MyList {
    Object[] array;
    int listSize = 0;

    public MyArrayList() {
        array = new Object[100];
    }

    /**
     * @param innitialListSize
     */
    public MyArrayList(int innitialListSize) {
        array = new Object[innitialListSize];
    }

    @Override
    public void add(Object o) {
        if (listSize == array.length) {
            Object[] tempArray = Arrays.copyOf(array, array.length*2);
            array = tempArray;
        }
        array[listSize] = o;
        listSize++;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public Object get(int index) {
        if (index > listSize) throw new MyException();
        return array[index];
    }

    @Override
    public int firstIndexOf(Object o) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
    //todo test if list has 5 elements and I get 5th element, and 6th element
}
