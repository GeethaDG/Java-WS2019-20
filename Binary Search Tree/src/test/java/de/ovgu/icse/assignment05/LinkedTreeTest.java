package de.ovgu.icse.assignment05;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LinkedTreeTest {
    @Mock
    LinkedTree mockedTree;
    LinkedTree<String> x;
    
    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        x = new LinkedTree<String>();

        x.insert(100, "Root");
        x.insert(150, "Right");
        x.insert(50, "Left");
        x.insert(200, "RightRight");
        x.insert(140, "RightLeft");
        x.insert(20, "LeftLeft");
        x.insert(70, "LeftRight");
    }

    @Test
    public void testInsert() {

        Mockito.when(mockedTree.search(100)).thenReturn(new LinkedList(Arrays.asList("Root")));
        Mockito.when(mockedTree.search(20)).thenReturn(new LinkedList(Arrays.asList("LeftLeft")));
        Mockito.when(mockedTree.search(140)).thenReturn(new LinkedList(Arrays.asList("RightLeft")));
        Mockito.when(mockedTree.search(50)).thenReturn(new LinkedList(Arrays.asList("Left")));

        assertEquals(mockedTree.search(100).get(0), x.search(100).get(0));
        assertEquals(mockedTree.search(20).get(0), x.search(20).get(0));
        assertEquals(mockedTree.search(140).get(0), x.search(140).get(0));
        assertEquals(mockedTree.search(50).get(0), x.search(50).get(0));
    }

    @Test
    public void testKeyNotInTree() {
        assertNull(x.search(0));
    }

    @Test
    public void testPreorder() {

        Mockito.when(mockedTree.preorder(0)).
            thenReturn(new LinkedList(Arrays.asList("Root", "Left", "LeftLeft", "LeftRight", "Right", "RightLeft", "RightRight")));
        assertEquals(mockedTree.preorder(0).toString(), x.preorder(0).toString());

    }

    @Test
    public void testPostorder() {
        Mockito.when(mockedTree.postorder(0)).
            thenReturn(new LinkedList(Arrays.asList("LeftLeft", "LeftRight", "Left", "RightLeft", "RightRight", "Right", "Root")));
        assertEquals(mockedTree.postorder(0).toString(), x.postorder(0).toString());
    }

    @Test
    public void testInorder() {
        Mockito.when(mockedTree.inorder(0)).
            thenReturn(new LinkedList(Arrays.asList("LeftLeft", "Left", "LeftRight", "Root", "RightLeft", "Right", "RightRight")));
    }
    
    @Test
    public final void deleteTest() {
        LinkedList<String>[] elements = new LinkedList[4];
        
        elements[0] = x.delete(100);
        elements[1] = x.delete(20);
        elements[2] = x.delete(150);
        elements[3] = x.delete(200);
        
        
        for (int i = 0; i < elements.length; i++)
            assertTrue(elements[i] != null && elements[i].size() == 1);
            
        assertTrue(elements[0].get(0).equals("Root"));
        assertTrue(elements[1].get(0).equals("LeftLeft"));
        assertTrue(elements[2].get(0).equals("Right"));
        assertTrue(elements[3].get(0).equals("RightRight"));

        assertTrue(x.search(50) != null);
        assertTrue(x.search(70) != null);
        assertTrue(x.search(140) != null);

        assertNull(x.search(100));
        assertNull(x.search(20));
        assertNull(x.search(150));
        assertNull(x.search(200));
        
    }
}
