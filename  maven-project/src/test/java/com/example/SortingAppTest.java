package com.example;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Testing SortingApp application
 */

public class SortingAppTest {
    public SortingApp sortingApp = new SortingApp();

    /**
     * Null case testing
     */

    @Test (expected = NullPointerException.class)
    public void testNullCase() {
        int[] array = null;
        Class<NullPointerException> ex = NullPointerException.class;
        SortingApp.sort(null);
        assertEquals(ex, array);
    }

    /**
     * Testing case for arguments greater than limited
     */

    @Test (expected = IllegalArgumentException.class)
    public void testMoreThanTenCase() {
        int[] array = {5, 4, 3, 2, 1, -2, 8, 12, -1, 99, 0};
        Class<IllegalArgumentException> ex = IllegalArgumentException.class;
        SortingApp.sort(array);
        assertEquals(ex, array);
    }

    /**
     * Empty case test
     */

    @Test
    public void testEmptyCase(){
        int[] array = {};
        int[] exp = array;
        SortingApp.sort(array);
        assertArrayEquals(exp, array);
    }

    /**
     * Single element array test
     */

    @Test
    public void testSingleElementArrayCase() {
        int[] array = {1};
        int[] expected = {1};
        SortingApp.sort(array);
        assertArrayEquals(expected, array);
    }

    /**
     * Test the array with maximal allowed integers
     */

    @Test
    public void testTenElementsCase() {
        int[] array = {5, 90, -25, 8, 46, 4000, -800, 1, 83, 65};
        int[] exp = {-800, -25, 1, 5, 8, 46, 65, 83, 90, 4000};
        SortingApp.sort(array);
        assertArrayEquals(exp, array);
    }
}