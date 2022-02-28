package de.ovgu.icse.assignment02;

/**
 * Tests used to check your submission.
 * Contains test for file Food.java
 *
 *
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FoodTest {
    static Food food1 = new Food(52, "Apple");
    static Food food2 = new Food(51, "Apple");
    static Food food3 = new Food(52, "AppleX");
    
    @Test
    public final void testGetCalories() {
        assertEquals(food1.getCalories(), 52);
        assertEquals(food2.getCalories(), 51);
    }
    
    @Test
    public final void testCompareTo() {
        assertEquals(food1.compareTo(food2), 1);
        assertEquals(food2.compareTo(food1), -1);
        assertEquals(food1.compareTo(food1), 0);
        assertEquals(food3.compareTo(food1), 1);
    }
    
    @Test
    public final void testToString() {
        assertEquals(food1.toString(), "Apple:52");
        assertEquals(food2.toString(), "Apple:51");
        assertEquals(food3.toString(), "AppleX:52");
    }
}

