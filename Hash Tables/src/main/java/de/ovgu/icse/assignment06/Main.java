package de.ovgu.icse.assignment06;

/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {
        // test your implementation here
        HashLinQuad linHashTable  = new HashLinQuad(1249);
        HashLinQuad quadHashTable = new HashLinQuad(1249);

        for(int i =0;i<1000;i++)
        {
            System.out.println(linHashTable.addLin(1));
            System.out.println(quadHashTable.addQuad(1));
        }
        //for linear probing

    }
}

