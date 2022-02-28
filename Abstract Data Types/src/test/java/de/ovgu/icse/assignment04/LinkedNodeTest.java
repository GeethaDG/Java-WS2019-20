package de.ovgu.icse.assignment04;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedNodeTest {
    LinkedNode<String> test;

    @BeforeEach
    public void setUp() {
        test  = new LinkedNode<String>("Monday");

        test.setNextNode(new LinkedNode<String>("Thursday"));
        test.getNextNode().setNextNode(new LinkedNode<String>("Friday"));

    }

    public void reorderNodes() {
        LinkedNode<String> save = test.getNextNode();

        test.setNextNode(new LinkedNode<String>("Tuesday"));
        test.getNextNode().setNextNode(new LinkedNode<String>("Wednesday"));
        test.getNextNode().getNextNode().setNextNode(save);
    }

    @Test
    public final void insertionTest() {
        
        reorderNodes();
        
        LinkedNode<String> iter = test;
        
        int i = 0;
        
        while (iter != null) {
            i++;
            iter = iter.getNextNode();
        }
        
        assertTrue(i == 5);
    }

    @Test
    public void testNodeOrder() {
        assertEquals("Thursday", test.getNextNode().getNodeData());
        assertEquals("Friday", test.getNextNode().getNextNode().getNodeData());
    }

    @Test
    public void testDayOrder() {

        reorderNodes();

        String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        LinkedNode<String> iter = test;

        int i = 0;

        while (iter != null) {
            assertEquals(weekdays[i], iter.getNodeData());
            i++;
            iter = iter.getNextNode();
        }

    }
}
