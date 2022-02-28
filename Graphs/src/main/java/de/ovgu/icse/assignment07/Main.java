package de.ovgu.icse.assignment07;

/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {
        //test your implementation here
        int[] v = {1, 2, 3, 4, 5, 6};
        int[][] e = {{1,1},{1,2},{1,4},{2,3},{2,4},{2,5},{3,6},{4,1},{5,6},{6,4}};

        MatrixGraph m = new MatrixGraph();
        System.out.println(m.inDegree(0, e));

        System.out.println(m.outDegree(0, e));

        for (int item : m.adjacent(2, e))
            System.out.println(item);
    }
}

