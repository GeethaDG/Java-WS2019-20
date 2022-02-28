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


public class HashLinQuadTest {
    @Test
    public final void addLinTest () {
        HashLinQuad linHashTable  = new HashLinQuad(1249);
        
        assertTrue(linHashTable.addLin(1) == 0);
        assertTrue(linHashTable.addLin(1) == 1);
        assertTrue(linHashTable.addLin(1) == 2);
        assertTrue(linHashTable.addLin(1) == 3);
        assertTrue(linHashTable.addLin(1) == 4);
        
        assertTrue(linHashTable.addLin(44) == 0);
        assertTrue(linHashTable.addLin(44) == 1);
        
        assertTrue(linHashTable.addLin(12) == 0);
    }
	  
	@Test
    public final void addQuadTest () { 
        HashLinQuad quadHashTable  = new HashLinQuad(1249);
        
        assertTrue(quadHashTable.addQuad(1) == 0);
        assertTrue(quadHashTable.addQuad(1) == 1);
        assertTrue(quadHashTable.addQuad(1) == 2);
        assertTrue(quadHashTable.addQuad(1) == 3);
        assertTrue(quadHashTable.addQuad(5) == 1);
        assertTrue(quadHashTable.addQuad(10) == 1);
        
        assertTrue(quadHashTable.addQuad(44) == 0);
        assertTrue(quadHashTable.addQuad(44) == 1);
        
        assertTrue(quadHashTable.addQuad(12) == 0);
    }
}

