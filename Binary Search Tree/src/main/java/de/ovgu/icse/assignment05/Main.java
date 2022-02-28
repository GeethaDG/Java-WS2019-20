package de.ovgu.icse.assignment05;
/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {
        //test your implementation here
        // the last question
        
        String[] data = {"R", "D", "T"};
        LinkedTree<String> head = new LinkedTree<String>(16, data);
        head.insert(8, "ACE");
        head.insert(4, "DRM");
        head.insert(15, "HOP");
        head.insert(23, "MIL");
        head.insert(42, "AHE");

        System.out.println(head.inorder(0)); // [DRM, ACE, HOP, R, MIL, AHE]
        System.out.println(head.postorder(1)); // [DRM, HOP, ACE, AHE, MIL, R]
        System.out.println(head.preorder(2)); // [R]

    }
}

