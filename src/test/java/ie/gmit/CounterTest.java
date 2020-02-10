package ie.gmit;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
