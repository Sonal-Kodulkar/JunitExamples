package TestSuit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTestClass {
    Addition addition= new Addition();
    @Test
    public void Testadd()
    {
        assertEquals(3, addition.add(2, 1));
    }
}
