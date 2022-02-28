package de.ovgu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    /**
     *
     * START: Test cases for method isArmstrongNumber()
     */

    @Test
    public final void testTrueArmstrongNumbers() {
       assertTrue(Main.isArmstrongNumber(9));
       assertTrue(Main.isArmstrongNumber(153));
      assertTrue(Main.isArmstrongNumber(1634));
    }

    @Test
    public final void testFalseArmstrongNumbers() {
        assertFalse(Main.isArmstrongNumber(10));
        assertFalse(Main.isArmstrongNumber(154));
        assertFalse(Main.isArmstrongNumber(1555));
    }

    /**
     * START: test cases for method greatestCommonDivisor()
     */

    @Test
    public final void gcdWithZeros() {
     assertEquals(0, Main.greatestCommonDivisor(0,2));
    assertEquals(0, Main.greatestCommonDivisor(2,0));
    assertEquals(0, Main.greatestCommonDivisor(0,0));
    }

    @Test
    public final void gcdWithoutRemainder() {
    assertEquals(2,Main.greatestCommonDivisor(4,2));
    //assertEquals(2, Main.greatestCommonDivisor(8,4));
    assertEquals(3,Main.greatestCommonDivisor(12,3));
    }

    @Test
    public final void gcdWithRemainder() {
     assertEquals(2, Main.greatestCommonDivisor(12,10));
     assertEquals(3, Main.greatestCommonDivisor(18,15));
    }

    @Test
    public final void gcdSwitchNumbers() {
    assertEquals(2, Main.greatestCommonDivisor(2,4));
    assertEquals(3,Main.greatestCommonDivisor(18,21));
    }

    @Test
    public final void testCreateRandom () {
       assertEquals(100, Main.createRandom(100).length);
       assertEquals(20, Main.createRandom(20).length);
       assertEquals(30, Main.createRandom(30).length);

        int[] array = Main.createRandom(100);

        for (int i = 0; i < array.length; i++) {
           assertTrue(array[i] >= 5 && array[i] <= 99);
        }
    }

    @Test
    public final void testPosMin() {
       assertEquals(6, Main.posMin(new int[]{100, 90, 80, 70, 60, 40, 10}));
      assertEquals(3, Main.posMin(new int[]{100, 80, 90, 2, 60, 40, 10}));
    }

    @Test
    public final void testPosMinWithDuplicates() {
      int[] numArray = {50, 30, 20, 10, 10};
    }

    @Test
    public final void testPosMinIsEmpty() {
      int[] numArray = {};
      assertEquals(-1, Main.posMin(numArray));
    }

    @Test
    public final void testToString() {
        int[] numArray = {3, 6, 11, 101};
        String numText = Arrays.toString(numArray);

        assertTrue(Main.toString(numArray).equalsIgnoreCase(numText));
    }

    @Test
    public final void testToStringIsNull() {
       assertEquals("", Main.toString(null));
    }

    @Test
    public final void testToStringIsEmpty() {
        int[] numArray = {};
        assertEquals("[]", Main.toString(numArray));
    }

    @Test
    public final void testSwap() {
      int[] array = {10, 20, 30, 40};

        Main.swap(array);

        assertTrue(array[0] == 40 && array[array.length - 1] == 10);
    }

}
