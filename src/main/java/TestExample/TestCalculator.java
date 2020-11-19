package TestExample;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestCalculator {

    Calculator c =new Calculator();
    @BeforeAll
    public static void setUpBeforeAll()
    {
        System.out.println("before test");
    }

    @AfterAll
    public static void setupAfterAll()
    {
        System.out.println("after test");
    }

//    @Test
//    public void checkObjectNullOrNot()
//    {
//        assertNull(c);
//    }

    @Test
    public void testAdd() {
        assertEquals(3, c.add(2, 1));
    }

    @Test
    public void testCircleArea() {
        assertEquals(113.03999999999999, c.computeCircleArea(6));
    }


}



