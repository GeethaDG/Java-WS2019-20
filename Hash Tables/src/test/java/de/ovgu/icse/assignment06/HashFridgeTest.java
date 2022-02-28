package de.ovgu.icse.assignment06; /**
 * Tests used to check a submission.
 * 
 * All tests in the "test_submission" folder are used for 
 * checking a submission and are executed when the 
 * "Submission" action is invoked.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class HashFridgeTest {
    @Test
    public final void insertTest() {
        HashFridge test = new HashFridge(100);
        
        test.insert(new Food(), 10);
        
        assertTrue(test.search(new Food()) == 10);
    }
    
    @Test
    public final void searchTest() {
        HashFridge test = new HashFridge(100);
        
        test.insert(new Food(), 10);
        
        assertTrue(test.search(new Food()) == 10);
    }
    
    @Test
    public final void removeTest() {
        HashFridge test = new HashFridge(100);
        
        test.insert(new Food(), 10);
        
        assertTrue(test.search(new Food()) == 10);
        
        test.remove(new Food(), 10);
        
        assertTrue(test.search(new Food()) == -1);
    }
}

