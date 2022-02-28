package de.ovgu.icse.assignment07;

import static org.junit.Assert.*;

import org.junit.jupiter.*;
import org.junit.jupiter.api.Test;


public class MatrixGraphTest {
	MatrixGraph graph = new MatrixGraph();
       int[][] matrix = new int[][]{{1, 1, 0, 1, 0}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}};

	@Test
	public final void inDegreeTest() {
		assertEquals(3, graph.inDegree(0, matrix));
		assertEquals(3, graph.inDegree(1, matrix));
		assertEquals(2, graph.inDegree(2, matrix));
		assertEquals(2, graph.inDegree(3, matrix));
		assertEquals(3, graph.inDegree(4, matrix));
	}
	
	@Test
	public final void outDegreeTest() {
		assertEquals(3, graph.outDegree(0, matrix));
		assertEquals(4, graph.outDegree(1, matrix));
		assertEquals(1, graph.outDegree(2, matrix));
		assertEquals(0, graph.outDegree(3, matrix));
		assertEquals(5, graph.outDegree(4, matrix));
	}
	
	@Test
	public final void adjacentTest() {
		assertEquals(3, graph.adjacent(0, matrix).size());
		assertEquals(4, graph.adjacent(1, matrix).size());
		assertEquals(1, graph.adjacent(2, matrix).size());
		assertEquals(5, graph.adjacent(4, matrix).size());
		assertEquals(0, graph.adjacent(3, matrix).size());
	}

}

