package de.ovgu.icse.assignment03;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.math.BigInteger;
import java.util.Comparator;

public class MainTest {
    @Test
    public final void testQuickSort() {
		int clocks_size = 100;
		Clock[] clocks = new Clock[clocks_size];

		for (int i = 0; i < clocks.length; i++)
			clocks[i] = new Clock((int) (Math.random() * 10000));
			
		Main.quickSort(clocks);
		
		for (int i = 0; i < clocks.length - 1; i++) {
		    assertTrue(clocks[i].compareTo(clocks[i + 1]) <= 0);
		}
    }
    
    @Test
    public final void testMergeSort() {
        String[] strings = new String[] {"This is a very long string", "This is a very long", "This is a very", "This is a", "This is", "This", "T"};
        
        Main.mergeSort(strings, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() < b.length())
                    return -1;
                if (a.length() > b.length()) 
                    return 1;
                return 0;
            }
        });
        
        for (int i = 0; i < strings.length - 1; i++) {
            assertTrue(strings[i].length() <= strings[i + 1].length());
        }
        
        Main.mergeSort(strings, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() < b.length())
                    return 1;
                if (a.length() > b.length()) 
                    return -1;
                return 0;
            }
        });
        
        for (int i = 0; i < strings.length - 1; i++) {
            assertTrue(strings[i].length() >= strings[i + 1].length());
        }
    }
}
