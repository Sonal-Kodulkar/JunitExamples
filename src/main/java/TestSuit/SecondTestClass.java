package TestSuit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTestClass {
    Subtraction subtraction = new Subtraction();
    @Test
    public void TestSubtraction()
    {
        assertEquals(1, subtraction.subtraction(2, 1));
    }
}
