package de.ovgu.icse.assignment04;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CarTest {
    Car x = new Car(false, false);
    
    @Test
    public final void unlockAllDoorsTest() {
        int len = x.getNumberOfDoors();
        
        x.unlockAllDoors();
        
        for (int i = 0; i < len; i++) {
            assertTrue(x.getDoorState(i) == false);
        }
    }
    
    @Test
    public final void lockAllDoorsTest() {
        int len = x.getNumberOfDoors();
        
        x.lockAllDoors();
        
        for (int i = 0; i < len; i++) {
            assertTrue(x.getDoorState(i) == true);
        }
    }
    
    @Test
    public final void getNumberOfDoorsTest() {
        assertTrue(x.getNumberOfDoors() == 4 || x.getNumberOfDoors() == 2);
    }
}
