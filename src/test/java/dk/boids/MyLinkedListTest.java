package dk.boids;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    public void testSizeOnEmptyList() {
        MyLinkedList<String> list = new MyLinkedList<>();
        assertEquals(0, list.size());
    }
}