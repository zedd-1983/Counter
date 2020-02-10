package ie.gmit;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CounterTest {

    private Counter myCounter;


    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
        myCounter = new Counter();
    }

    @DisplayName("Constructor test")
    @Test
    void testConstructor()
    {
        assertEquals(0, myCounter.getCount());
    }

    @DisplayName("Increment test")
    @Test
    void testIncrement()
    {
        myCounter.incrementCount();
        assertEquals(1, myCounter.getCount());
    }

    @DisplayName("Decrement test")
    @Test
    void testDecrement()
    {
        myCounter.decrementCount();
        assertEquals(-1, myCounter.getCount());
    }

    @DisplayName("Parametric constructor test")
    @Test
    void testParametricConstructor()
    {
        assertThrows(IllegalArgumentException.class, ()-> {new Counter(-1);});
    }


}
