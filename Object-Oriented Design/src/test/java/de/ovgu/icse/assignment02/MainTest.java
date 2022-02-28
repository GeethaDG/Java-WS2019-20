package de.ovgu.icse.assignment02;

/**
 * Tests used to check your submission.
 * Contains test for file Main.java
 *
 * 
 */

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

public class MainTest {


    @Test
    public void testCollatzNonValidRecursive(){
        assertEquals(0, Main.collatzRecursive(0));
        assertEquals(0, Main.collatzRecursive(-10));
    }

    @Test
    public void testCollatzNonValidIterative(){
        assertEquals(0, Main.collatzIterative(0));
        assertEquals(0, Main.collatzIterative(-10));
    }

    @Test
    public void testCollatzValidRecursive() {
        assertEquals(1, Main.collatzRecursive(1));
        assertEquals(8, Main.collatzRecursive(3));
        assertEquals(9, Main.collatzRecursive(6));
    }

    @Test
    public void testCollatzValidIterative() {
        assertEquals(1, Main.collatzIterative(1));
        assertEquals(8, Main.collatzIterative(3));
        assertEquals(9, Main.collatzIterative(6));
    }
}

