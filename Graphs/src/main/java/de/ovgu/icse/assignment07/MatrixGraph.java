package de.ovgu.icse.assignment07;

import java.util.List;
import java.util.LinkedList;

public class MatrixGraph {

    public int inDegree(int vertex, int[][] edge) {
        //your implementation goes here

        int indegs = 0;
        for (int i = 0; i < edge.length; i++)
            if (edge[i][vertex] > 0)
                indegs += 1;
        return indegs;
    }
    
    public int outDegree(int vertex, int[][] edge) {
        //your implementation goes here

        int outdegs = 0;
        for (int j = 0; j < edge[vertex].length; j++)
            if (edge[vertex][j] > 0)
                outdegs += 1;
        return outdegs;
    }
    
    public List<Integer> adjacent(int vertex, int[][] edge) {
        //your implementation goes here
        List<Integer> adjVertices = new LinkedList<Integer>();

        for (int col = 0; col < edge[vertex].length; col++)
            if (edge[vertex][col] > 0)
                adjVertices.add(edge[vertex][col]);
        return adjVertices;
    }

}
