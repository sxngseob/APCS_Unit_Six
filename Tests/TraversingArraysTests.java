import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TraversingArraysTests {

    @Test
    public void buildArrayTestFour() {
        int[] expected = {0, 1, 2, 3};
        int[] actual = ArrayTraversal.buildArray(4);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void buildArrayTestZero() {
        int[] expected = {};
        int[] actual = ArrayTraversal.buildArray(0);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void buildArrayTestTen() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = ArrayTraversal.buildArray(10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void countEvenTestMixed() {
        int[] numbers = {5, 2, 6, 8, 3, 13, 25, 19, 8, 8, 8};
        int expected = 6;
        int actual = ArrayTraversal.countEven(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void countEvenTestAllEven() {
        int[] numbers = {2, 2, 0, 0, 4};
        int expected = 5;
        int actual = ArrayTraversal.countEven(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void countEvenTestAllOdd() {
        int[] numbers = {1, 3, 5, 7, 9, 13};
        int expected = 0;
        int actual = ArrayTraversal.countEven(numbers);
        assertEquals(expected, actual);
    }


    @Test
    public void sum28TestTrue() {
        assertTrue(ArrayTraversal.sum28(new int[]{2, 3, 2, 2, 4, 2}));
    }


    @Test
    public void sum28TestTooHigh() {
        assertTrue(ArrayTraversal.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
    }

    @Test
    public void sum28TestTooLow() {
        assertTrue(ArrayTraversal.sum28(new int[]{1, 2, 3, 4}));
    }
}
