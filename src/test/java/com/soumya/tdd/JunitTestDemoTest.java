package com.soumya.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitTestDemoTest {

    private JunitTestDemo j;

    @Before
    public void setUp() throws Exception {
        j = new JunitTestDemo();
    }

    @Test
    public void testAddNumbers(){
        assertEquals("Test addNumbers method.",10,j.addNumbers(5,5));
    }

    @Test
    public void testDevideNumbers(){
        assertEquals("Test devide method.",1.0,j.devideNumbers(5,5),0.001);
    }


    @Test(expected = ArithmeticException.class)
    public void testDivideNumbersByZero(){
        assertEquals("Test divide method.",0,j.devideNumbers(5,0));
    }


}