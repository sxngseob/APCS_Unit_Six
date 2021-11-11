import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayAlgorithmsTests {

    @Test
    public void checkForAllNegativesTrue() {
        assertTrue(ArrayAlgorithms.checkForAllNegatives(new int[] {-2, -9, -6, -8, -9, -3, -1}));
    }

    @Test
    public void checkForAllNegativesFalse() {
        assertFalse(ArrayAlgorithms.checkForAllNegatives(new int[] {-2, -9, -6, -8, -9, -3, 0}));
    }

    @Test
    public void hasDupesTrue() {
        assertTrue(ArrayAlgorithms.hasDupes(new int[] {23, 7, 14, 39, 46, 52, 5, 65, 75, 83, 76, 44, 90, 6, 2, 5}));
    }

    @Test
    public void hasDupesFalse() {
        assertFalse(ArrayAlgorithms.hasDupes(new int[] {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11}));
    }

    @Test
    public void leftShiftSix() {
        int[] expected = {1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0};
        int[] actual = ArrayAlgorithms.leftShift(new int[] {1, 0, 1, 1, 0, 1, 0, 1}, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void leftShiftThree() {
        int[] expected = {1, 1, 1, 0, 0, 0};
        int[] actual = ArrayAlgorithms.leftShift(new int[] {1, 1, 1}, 3);
        assertEquals(expected, actual);
    }
}
