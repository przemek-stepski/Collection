import java.util.Arrays;

public class MyArrayList implements MyList {
    Object[] array;
    int currentIndex = 0;

    public MyArrayList() {
        array = new Object[10];
    }

    /**
     * @param innitialListSize
     */
    public MyArrayList(int innitialListSize) {
        array = new Object[innitialListSize];
    }

    @Override
    public void add(Object o) {
        if (currentIndex == array.length - 1) {
            Object[] tempArray = Arrays.copyOf(array, array.length * 2);
            array = tempArray;
        }
        array[currentIndex] = o;
        currentIndex++;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            for (int i = 0; i < currentIndex; i++) {
                if (array[i] == o) {
                    return true;
                }
            }
        }
        for (int i = 0; i < currentIndex; i++) {
            if (array[i].equals(o)) {
                return (true);
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            remove(firstIndexOf(o));
            return true;

        }
        return false;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= currentIndex) throw new MyException();
        Object toReturn = array[index];
        for (int i = index; i < currentIndex; i++) {
            array[i] = array[i + 1];
        }
        currentIndex--;
        return toReturn;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= currentIndex) throw new MyException();
        return array[index];
    }

    @Override
    public int firstIndexOf(Object o) {
        if (contains(o)) {
            if (o == null) {
                for (int i = 0; i < currentIndex; i++) {
                    if (array[i] == o) {
                        System.out.println("List contains your object at index: " + i);
                        return i;
                    }
                }
            }
            for (int i = 0; i < currentIndex; i++) {
                if (array[i].equals(o)) {
                    System.out.println("List contains your object at index: " + i);
                    return i;
                }
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return currentIndex;
    }
}
