package dk.boids;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void testSizeOnEmptyList() {
        MyArrayList<String> list = new MyArrayList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeAfterAddingOneElement() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("first");
        assertEquals(1, list.size());
    }

    @Test
    public void testSizeAfterAddingMultipleElements() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals(3, list.size());
    }

    @Test
    public void testSizeWithDifferentTypes() {
        MyArrayList<Integer> intList = new MyArrayList<>();
        intList.add(1);
        intList.add(2);
        assertEquals(2, intList.size());

        MyArrayList<Double> doubleList = new MyArrayList<>();
        doubleList.add(1.5);
        assertEquals(1, doubleList.size());
    }

    @Test
    public void testSizeAfterRemovingFromSingleElementList() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("element");
        assertEquals(1, list.size());
        
        assertTrue(list.remove("element"));
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeAfterRemovingFirstElement() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals(3, list.size());
        
        assertTrue(list.remove("first"));
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeAfterRemovingMiddleElement() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals(3, list.size());
        
        assertTrue(list.remove("second"));
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeAfterRemovingLastElement() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals(3, list.size());
        
        assertTrue(list.remove("third"));
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeAfterRemovingNonExistentElement() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("first");
        list.add("second");
        assertEquals(2, list.size());
        
        assertFalse(list.remove("nonexistent"));
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeAfterRemovingFromEmptyList() {
        MyArrayList<String> list = new MyArrayList<>();
        assertEquals(0, list.size());

        assertFalse(list.remove("anything"));
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeAfterMultipleAdditionsAndRemovals() {
        MyArrayList<Integer> list = new MyArrayList<>();
        assertEquals(0, list.size());
        
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
        
        assertTrue(list.remove(2));
        assertEquals(2, list.size());
        
        list.add(4);
        list.add(5);
        assertEquals(4, list.size());
        
        assertTrue(list.remove(1));
        assertTrue(list.remove(5));
        assertEquals(2, list.size());
        
        assertFalse(list.remove(999));
        assertEquals(2, list.size());
    }

    @Test
    public void testAddingMoreThanTenElements() {
        MyArrayList<Integer> list = new MyArrayList<>();
        
        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }
        
        assertEquals(15, list.size());
        assertEquals((Integer) 1, list.get(0));
        assertEquals((Integer) 10, list.get(9));
        assertEquals((Integer) 15, list.get(14));
    }
}