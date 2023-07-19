package com.haloz.lists.impl;

import com.haloz.exception.ElementIsNotFoundException;
import com.haloz.lists.api.IntegerList;
import com.haloz.lists.api.StringList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    private IntegerList integerList;
    private Integer el;
    @BeforeEach
    void setUp() {
        integerList = new IntegerListImpl(1,2,3,4);
        el = 0;
    }
    @Test
    void addAndGet() {
        integerList.add(el);
        integerList.add(0, el);

        Assertions.assertEquals(integerList.get(integerList.size() - 1), el);
        Assertions.assertEquals(integerList.get(0), el);
    }
    @Test
    void set() {
        int expectedSize = integerList.size();
        integerList.set(0, el);

        Assertions.assertEquals(integerList.get(0), el);
        Assertions.assertEquals(expectedSize, integerList.size());
    }

    @Test
    void remove() {
        int expectedSize = integerList.size();

        Assertions.assertThrows(ElementIsNotFoundException.class, () -> integerList.remove(el));
        Assertions.assertEquals(expectedSize, integerList.size());

        Assertions.assertNotNull(integerList.remove(integerList.get(0)));
        Assertions.assertEquals(--expectedSize, integerList.size());

        Assertions.assertNotNull(integerList.remove(0));
        Assertions.assertEquals(--expectedSize, integerList.size());
    }
    @Test
    void contains() {
        Assertions.assertFalse(integerList.contains(el));

        integerList.add(el);

        Assertions.assertTrue(integerList.contains(el));
    }

    @Test
    void indexOf() {
        Assertions.assertEquals(0, integerList.indexOf(integerList.get(0)));
        Assertions.assertEquals(-1, integerList.indexOf(el));
    }

    @Test
    void lastIndexOf() {
        integerList.add(el);
        integerList.add(el);

        Assertions.assertNotEquals(integerList.indexOf(el), integerList.lastIndexOf(el));
        Assertions.assertEquals(integerList.get(integerList.size() - 1), integerList.get(integerList.lastIndexOf(el)));
        Assertions.assertEquals(integerList.get(integerList.size() - 1), integerList.get(integerList.indexOf(el)));
    }

    @Test
    void testEquals() {
        IntegerList integerList1 = new IntegerListImpl();

        Assertions.assertFalse(integerList.equals(integerList1));

        integerList1 = new IntegerListImpl(integerList);

        Assertions.assertTrue(integerList.equals(integerList1));
    }

    @Test
    void isEmpty() {
        IntegerList integerList1 = new IntegerListImpl();

        Assertions.assertTrue(integerList1.isEmpty());

        integerList1.add(el);

        Assertions.assertFalse(integerList1.isEmpty());
    }

    @Test
    void clear() {
        integerList.clear();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> integerList.get(0));
    }
}