package dk.boids;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    public void testSizeOnEmptyList() {
        MyLinkedList<String> list = new MyLinkedList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeAfterAddingOneElement() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("first");
        assertEquals(1, list.size());
    }

    @Test
    public void testSizeAfterAddingMultipleElements() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals(3, list.size());
    }

    @Test
    public void testSizeWithDifferentTypes() {
        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(1);
        intList.add(2);
        assertEquals(2, intList.size());

        MyLinkedList<Double> doubleList = new MyLinkedList<>();
        doubleList.add(1.5);
        assertEquals(1, doubleList.size());
    }

    @Test
    public void testSizeAfterRemovingFromSingleElementList() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("element");
        assertEquals(1, list.size());
        
        assertTrue(list.remove("element"));
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeAfterRemovingFirstElement() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals(3, list.size());
        
        assertTrue(list.remove("first"));
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeAfterRemovingMiddleElement() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals(3, list.size());
        
        assertTrue(list.remove("second"));
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeAfterRemovingLastElement() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals(3, list.size());
        
        assertTrue(list.remove("third"));
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeAfterRemovingNonExistentElement() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("first");
        list.add("second");
        assertEquals(2, list.size());
        
        assertFalse(list.remove("nonexistent"));
        assertEquals(2, list.size());
    }

    @Test
    public void testSizeAfterRemovingFromEmptyList() {
        MyLinkedList<String> list = new MyLinkedList<>();
        assertEquals(0, list.size());

        assertFalse(list.remove("anything"));
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeAfterMultipleAdditionsAndRemovals() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
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
}