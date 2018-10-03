package at.hul.learn;

import static org.junit.Assert.*;

public class MatheratorTest {

    private Matherator classUnderTest;

    @org.junit.Before
    public void setUp() throws Exception {

        classUnderTest = new Matherator();
    }

    @org.junit.Test
    public void add() {
        //Let Java add it up
        long result = 10 + 23 + (-1) + 16;

        //Compare to Matherator
        assertEquals(result, classUnderTest.add(10, 23, -1, 16));


        result = 100 + 102;
        assertEquals(result, classUnderTest.add(100, 102));


        //Boundary Test
        result = 0;
        assertEquals(result, classUnderTest.add(0, 0, 0));
    }

    @org.junit.Test
    public void subtract() {
        long result = 100 - 7 - (-17) - 24;
        assertEquals(result, classUnderTest.subtract(100, 7, -17, 24));


        //Boundary Test
        result = 0;
        assertEquals(result, classUnderTest.subtract(0, 0, 0));
    }
}