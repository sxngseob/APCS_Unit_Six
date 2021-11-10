import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnhancedLoopTests {

    private static int[] list = {7, 5, 3, 8, 11, -4, 0, -2};
    private static double[] doubleList = {6.5, 4.7, -2.4, 0.0, -8, 3.14, -12};
    private static String[] strList = {"Sporty", "Scary", "Baby", "Posh", "Ginger"};

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
}
