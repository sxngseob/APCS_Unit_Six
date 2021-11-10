import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCreationTests {

    private static int[] list = {7, 5, 3, 8, 11, -4, 0, -2};
    private static double[] doubleList = {6.5, 4.7, -2.4, 0.0, -8, 3.14, -12};
    private static String[] strList = {"Sporty", "Scary", "Baby", "Posh", "Ginger"};

    @Test
    public void getAverageTooFew() {
        double expected = 0.0;
        double actual = ArrayCreation.getAverage(new double[] {9.6, 3.4});
        assertEquals(expected, actual);
    }

    @Test
    public void getAverageEvenEnough() {
        double expected = 16.0;
        double actual = ArrayCreation.getAverage(new double[] {11.2, -93.4, 3.8, 32.9});
        assertEquals(expected, actual);
    }

    @Test
    public void getAverageOddEnough() {
        double expected = 4.0;
        double actual = ArrayCreation.getAverage(new double[] {2.4, 3.8, 9.2, 1.6, 4.5, 5.9, 8.1});
        assertEquals(expected, actual);
    }

    @Test
    public void stringArrayAllFive() {
        String expected = "6 5 4 4 6";
        String actual = ArrayCreation.stringArray(new String[] {"Sporty", "Scary", "Baby", "Posh", "Ginger"});
        assertEquals(expected, actual);
    }

    @Test
    public void stringArrayTooFew() {
        String expected = "";
        String actual = ArrayCreation.stringArray(new String[] {"Hannah", "Jim", "Shaakira"});
        assertEquals(expected, actual);
    }

    @Test
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
}
