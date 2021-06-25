import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MyArrayListTest {

    @Test
    public void testAddShouldShowListContainAddedElements() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");
        myArrayList.add(null);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.array[i]);

            assertEquals(3, myArrayList.currentIndex);
        }
    }
    @Test
    public void testContainsShouldReturnTrueIfObjectInList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertTrue(myArrayList.contains("Poniedziałek"));
    }

    @Test
    public void testContainsShouldReturnFalseIfObjectNotInList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertFalse(myArrayList.contains("Środa"));
    }

    @Test
    public void testContainsNullShouldReturnFalseIfNoNullInList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertFalse(myArrayList.contains(null));
    }

    @Test
    public void testContainsNullShouldReturnTrueIfNullInList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add(null);
        myArrayList.add("Wtorek");

        assertTrue(myArrayList.contains(null));
    }

    @Test
    void testRemoveShouldReturnTrueIfObjectRemoved() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertTrue(myArrayList.remove("Poniedziałek"));
    }

    @Test
    void testRemoveShouldReturnTrueIfObjectRemovedIsNull() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add(null);
        myArrayList.add("Wtorek");

        assertTrue(myArrayList.remove(null));
    }


    @Test
    void testRemoveShouldReturnFalseIfObjectRemovedNotInList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertFalse(myArrayList.remove("Środa"));
    }

    @Test
    void testRemoveShouldReturnFalseIfNullRemovedNotInList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertFalse(myArrayList.remove(null));
    }

    @Test
    void testRemoveShouldReturnActualListSize() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");
        myArrayList.remove("Poniedziałek");

        assertEquals(1, myArrayList.size());
    }

    @Test
    void testRemoveShouldReturnObjectFromNexIndex() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");
        myArrayList.add("Środa");

        myArrayList.remove(0);

        assertEquals("Wtorek", myArrayList.get(0));
        assertEquals("Środa", myArrayList.get(1));

    }

    @Test
    void testRemoveShouldReturnRemovedObject() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertEquals("Poniedziałek", myArrayList.remove(0));
    }

    @Test
    public void testRemoveShouldThrowExceptionIfIndexOutOfBond() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");
        myArrayList.add("Środa");

        myArrayList.remove(0);

        assertThrows(MyException.class, () -> myArrayList.remove(2));
    }

    @Test
    public void testGetShouldReturnObjectIfIndexInBond() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertEquals("Wtorek", myArrayList.get(1));
        assertEquals("Poniedziałek", myArrayList.get(0));
    }

    @Test
    public void testGetShouldThrowExceptionIfIndexOutOfBond() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertThrows(MyException.class, () -> {
            myArrayList.get(2);
        });
    }

    @Test
    public void testFirsIndexShouldReturnFirstIndexIfObjectInList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");
        myArrayList.add("Poniedziałek");

        assertEquals(0, myArrayList.firstIndexOf("Poniedziałek"));
        assertEquals(1, myArrayList.firstIndexOf("Wtorek"));
    }

    @Test
    public void testFirsIndexShouldReturnMinusOneIfObjectNotInList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");

        assertEquals(-1, myArrayList.firstIndexOf("Środa"));
        assertEquals(-1, myArrayList.firstIndexOf(null));
    }

    @Test
    public void testSizesShouldReturnListSize() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Poniedziałek");
        myArrayList.add("Wtorek");
        myArrayList.add(null);

        assertEquals(3, myArrayList.size());
    }

    @Test
    public void testSizesShouldReturnZeroIfListIsEmpty() {
        MyArrayList myArrayList = new MyArrayList();

        assertEquals(0, myArrayList.size());
    }

    @Test
    public void testSizesShouldThrowExceptionIfListIsNull() {
        MyArrayList myArrayList = null;

        assertThrows(NullPointerException.class, () -> {myArrayList.size();});
    }

}