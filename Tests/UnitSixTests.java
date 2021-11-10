import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class UnitSixTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;


    @BeforeEach
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }






    @Test
    @Order(19)
    public void checkForAllNegativesTrue() {
        assertTrue(ArrayAlgorithms.checkForAllNegatives(new int[] {-2, -9, -6, -8, -9, -3, -1}));
    }

    @Test
    @Order(20)
    public void checkForAllNegativesFalse() {
        assertFalse(ArrayAlgorithms.checkForAllNegatives(new int[] {-2, -9, -6, -8, -9, -3, 0}));
    }

    @Test
    @Order(21)
    public void hasDupesTrue() {
        assertTrue(ArrayAlgorithms.hasDupes(new int[] {23, 7, 14, 39, 46, 52, 5, 65, 75, 83, 76, 44, 90, 6, 2, 5}));
    }

    @Test
    @Order(22)
    public void hasDupesFalse() {
        assertFalse(ArrayAlgorithms.hasDupes(new int[] {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11}));
    }

    @Test
    @Order(23)
    public void leftShiftSix() {
        int[] expected = {1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0};
        int[] actual = ArrayAlgorithms.leftShift(new int[] {1, 0, 1, 1, 0, 1, 0, 1}, 6);
        assertEquals(expected, actual);
    }

    @Test
    @Order(24)
    public void leftShiftThree() {
        int[] expected = {1, 1, 1, 0, 0, 0};
        int[] actual = ArrayAlgorithms.leftShift(new int[] {1, 1, 1}, 3);
        assertEquals(expected, actual);
    }

}