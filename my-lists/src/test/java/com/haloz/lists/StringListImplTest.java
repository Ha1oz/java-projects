package com.haloz.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    private StringList stringList;
    private String el;
    @BeforeEach
    void setUp() {
        stringList = new StringListImpl("1", "2", "3", "4");
        el = "0";
    }
    @Test
    void addAndGet() {
        stringList.add(el);
        stringList.add(0, el);

        Assertions.assertEquals(stringList.get(stringList.size() - 1), el);
        Assertions.assertEquals(stringList.get(0), el);
    }
    @Test
    void set() {
        int expectedSize = stringList.size();
        stringList.set(0, el);

        Assertions.assertEquals(stringList.get(0), el);
        Assertions.assertEquals(expectedSize, stringList.size());
    }

    @Test
    void remove() {
        int expectedSize = stringList.size();

        Assertions.assertNull(stringList.remove(el));
        Assertions.assertEquals(expectedSize, stringList.size());

        Assertions.assertNotNull(stringList.remove(stringList.get(0)));
        Assertions.assertEquals(--expectedSize, stringList.size());

        Assertions.assertNotNull(stringList.remove(0));
        Assertions.assertEquals(--expectedSize, stringList.size());
    }
    @Test
    void contains() {
        Assertions.assertFalse(stringList.contains(el));
        Assertions.assertTrue(stringList.contains(stringList.get(0)));
    }

    @Test
    void indexOf() {
        Assertions.assertEquals(0, stringList.indexOf(stringList.get(0)));
        Assertions.assertEquals(-1, stringList.indexOf(el));
    }

    @Test
    void lastIndexOf() {
        stringList.add(el);
        stringList.add(el);

        Assertions.assertNotEquals(stringList.indexOf(el), stringList.lastIndexOf(el));
        Assertions.assertEquals(stringList.get(stringList.size() - 1), stringList.get(stringList.lastIndexOf(el)));
        Assertions.assertEquals(stringList.get(stringList.size() - 1), stringList.get(stringList.indexOf(el)));
    }

    @Test
    void testEquals() {
        StringList stringList1 = new StringListImpl();

        Assertions.assertFalse(stringList.equals(stringList1));

        stringList1 = new StringListImpl(stringList);

        Assertions.assertTrue(stringList.equals(stringList1));
    }

    @Test
    void isEmpty() {
        StringList stringList1 = new StringListImpl();

        Assertions.assertTrue(stringList1.isEmpty());

        stringList1.add(el);

        Assertions.assertFalse(stringList1.isEmpty());
    }

    @Test
    void clear() {
        stringList.clear();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> stringList.get(0));
    }
}