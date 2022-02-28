package de.ovgu.icse.assignment04;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BusTest {
    Bus x = new Bus(false, false);

    @Test
    public final void testConstructor() {
        Bus x1 = new Bus(false, true);
        Bus x2 = new Bus(true, false);
        Bus x3 = new Bus(true, true);
        
        assertTrue(x.getWiperState() == x1.getWiperState() && x.getWiperState() == false);
        assertTrue(x.getTrunkState() == x2.getTrunkState() && x.getTrunkState() == false);

        assertTrue(x2.getWiperState() == x3.getWiperState() && x2.getWiperState() == true);
        assertTrue(x3.getTrunkState() == x1.getTrunkState() && x3.getTrunkState() == true);
    }
    
    @Test
    public final void getNumberOfDoorsTest() {
        assertEquals(x.getNumberOfDoors(), 2);
    }

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
    public final void toggle_wiperTest() {
        boolean old = x.getWiperState();
        
        x.toggle_wiper();
        
        assertTrue(old != x.getWiperState());
    }
    
    @Test
    public void openTrunkTest() {
        x.openTrunk();
        
        assertTrue(x.getTrunkState() == true);
    }
    
    @Test
    public void closeTrunkTest() {
        x.closeTrunk();
        
        assertTrue(x.getTrunkState() == false);
    }
}
