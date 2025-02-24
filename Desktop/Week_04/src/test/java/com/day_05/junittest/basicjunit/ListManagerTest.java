package com.day_05.junit.basicjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        ListManager.addElement(list, 10);
        assertEquals(1, list.size());
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        ListManager.addElement(list, 10);
        ListManager.addElement(list, 20);
        ListManager.removeElement(list, 10);
        assertEquals(1, list.size());
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        assertEquals(0, ListManager.getSize(list));
        ListManager.addElement(list, 30);
        assertEquals(1, ListManager.getSize(list));
    }
}
