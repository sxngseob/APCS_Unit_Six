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
    private static int[] list = {7, 5, 3, 8, 11, -4, 0, -2};
    private static double[] doubleList = {6.5, 4.7, -2.4, 0.0, -8, 3.14, -12};
    private static String[] strList = {"Sporty", "Scary", "Baby", "Posh", "Ginger"};

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
    @Order(1)
    public void getAverageTooFew() {
        double expected = 0.0;
        double actual = ArrayCreation.getAverage(new double[] {9.6, 3.4});
        assertEquals(expected, actual);
    }

    @Test
    @Order(2)
    public void getAverageEvenEnough() {
        double expected = 16.0;
        double actual = ArrayCreation.getAverage(new double[] {11.2, -93.4, 3.8, 32.9});
        assertEquals(expected, actual);
    }

    @Test
    @Order(3)
    public void getAverageOddEnough() {
        double expected = 4.0;
        double actual = ArrayCreation.getAverage(new double[] {2.4, 3.8, 9.2, 1.6, 4.5, 5.9, 8.1});
        assertEquals(expected, actual);
    }

    @Test
    @Order(4)
    public void stringArrayAllFive() {
        String expected = "4 6 5 5 7";
        String actual = ArrayCreation.stringArray(new String[] {"Fred", "Barney", "Betty", "Wilma", "Pebbles"});
        assertEquals(expected, actual);
    }

    @Test
    @Order(5)
    public void stringArrayTooFew() {
        String expected = "";
        String actual = ArrayCreation.stringArray(new String[] {"Athos", "Porthos", "Aramis"});
        assertEquals(expected, actual);
    }

    @Test
    @Order(6)
    public void countryDataTest() {
        String phrase1 = "The capital of China is Beijing and the primary language is Mandarin";
        String phrase2 = "The capital of Egypt is Cairo and the primary language is Arabic";
        String phrase3 = "The capital of France is Paris and the primary language is French";
        String phrase4 = "The capital of South Korea is Seoul and the primary language is Korean";
        String phrase5 = "The capital of Germany is Berlin and the primary language is German";
        String phrase6 = "The capital of India is New Delhi and the primary language is Hindi";
        String phrase7 = "The capital of Japan is Tokyo and the primary language is Japanese";
        String phrase8 = "The capital of Ghana is Accra and the primary language is Akuapem Twi";
        String phrase9 = "The capital of Kenya is Nairobi and the primary language is Swahili";
        String phrase10 = "The capital of Mexico is Mexico City and the primary language is Spanish";
        String phrase11 = "The capital of United Kingdom is London and the primary language is English";
        String phrase12 = "The capital of Burkina Faso is Ouagadougou and the primary language is French";
        String phrase13 = "The capital of United States is Washington D.C. and the primary language is English";

        boolean foundPhrase1 = false;
        boolean foundPhrase2 = false;
        boolean foundPhrase3 = false;
        boolean foundPhrase4 = false;
        boolean foundPhrase5 = false;
        boolean foundPhrase6 = false;
        boolean foundPhrase7 = false;
        boolean foundPhrase8 = false;
        boolean foundPhrase9 = false;
        boolean foundPhrase10 = false;
        boolean foundPhrase11 = false;
        boolean foundPhrase12 = false;
        boolean foundPhrase13 = false;

        for (int i=0; i<1000; i++) {
            String phrase = ArrayCreation.countryData();
            if (phrase.equals(phrase1))
                foundPhrase1 = true;
            if (phrase.equals(phrase2))
                foundPhrase2 = true;
            if (phrase.equals(phrase3))
                foundPhrase3 = true;
            if (phrase.equals(phrase4))
                foundPhrase4 = true;
            if (phrase.equals(phrase5))
                foundPhrase5 = true;
            if (phrase.equals(phrase6))
                foundPhrase6 = true;
            if (phrase.equals(phrase7))
                foundPhrase7 = true;
            if (phrase.equals(phrase8))
                foundPhrase8 = true;
            if (phrase.equals(phrase9))
                foundPhrase9 = true;
            if (phrase.equals(phrase10))
                foundPhrase10 = true;
            if (phrase.equals(phrase11))
                foundPhrase11 = true;
            if (phrase.equals(phrase12))
                foundPhrase12 = true;
            if (phrase.equals(phrase13))
                foundPhrase13 = true;
        }

        boolean foundAll = foundPhrase1 && foundPhrase2 && foundPhrase3 && foundPhrase4 && foundPhrase5 &&
                foundPhrase6 && foundPhrase7 && foundPhrase8 && foundPhrase9 && foundPhrase10 && foundPhrase11 &&
                foundPhrase12 && foundPhrase13;

        assertTrue(foundAll);
    }

    @Test
    @Order(7)
    public void buildArrayTestFour() {
        int[] expected = {0, 1, 2, 3};
        int[] actual = ArrayTraversal.buildArray(4);
        assertArrayEquals(expected, actual);

    }

    @Test
    @Order(8)
    public void buildArrayTestZero() {
        int[] expected = {};
        int[] actual = ArrayTraversal.buildArray(0);
        assertArrayEquals(expected, actual);

    }

    @Test
    @Order(9)
    public void buildArrayTestTen() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = ArrayTraversal.buildArray(10);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Order(10)
    public void countEvenTestMixed() {
        int[] numbers = {5, 2, 6, 8, 3, 13, 25, 19, 8, 8, 8};
        int expected = 6;
        int actual = ArrayTraversal.countEven(numbers);
        assertEquals(expected, actual);
    }

    @Test
    @Order(11)
    public void countEvenTestAllEven() {
        int[] numbers = {2, 2, 0, 0, 4};
        int expected = 5;
        int actual = ArrayTraversal.countEven(numbers);
        assertEquals(expected, actual);
    }

    @Test
    @Order(12)
    public void countEvenTestAllOdd() {
        int[] numbers = {1, 3, 5, 7, 9, 13};
        int expected = 0;
        int actual = ArrayTraversal.countEven(numbers);
        assertEquals(expected, actual);
    }


    @Test
    @Order(13)
    public void sum28TestTrue() {
        assertTrue(ArrayTraversal.sum28(new int[]{2, 3, 2, 2, 4, 2}));
    }


    @Test
    @Order(14)
    public void sum28TestTooHigh() {
        assertTrue(ArrayTraversal.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
    }

    @Test
    @Order(15)
    public void sum28TestTooLow() {
        assertTrue(ArrayTraversal.sum28(new int[]{1, 2, 3, 4}));
    }

    @Test
    @Order(16)
    public void printStandardFor() {
        assertEquals("7 5 3 8 11 -4 0 -2 ", EnhancedForLoops.printStandardFor(list));
        assertEquals("6.5 4.7 -2.4 0.0 -8.0 3.14 -12.0 ", EnhancedForLoops.printStandardFor(doubleList));
        assertEquals("Sporty Scary Baby Posh Ginger ", EnhancedForLoops.printStandardFor(strList));
    }


    @Test
    @Order(17)
    public void printEnhancedFor() {
        assertEquals("7 5 3 8 11 -4 0 -2 ", EnhancedForLoops.printEnhancedFor(list));
        assertEquals("6.5 4.7 -2.4 0.0 -8.0 3.14 -12.0 ", EnhancedForLoops.printEnhancedFor(doubleList));
        assertEquals("Sporty Scary Baby Posh Ginger ", EnhancedForLoops.printEnhancedFor(strList));
    }



    @Test
    @Order(18)
    public void printStandardWhile() {
        assertEquals("7 5 3 8 11 -4 0 -2 ", EnhancedForLoops.printStandardWhile(list));
        assertEquals("6.5 4.7 -2.4 0.0 -8.0 3.14 -12.0 ", EnhancedForLoops.printStandardWhile(doubleList));
        assertEquals("Sporty Scary Baby Posh Ginger ", EnhancedForLoops.printStandardWhile(strList));
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