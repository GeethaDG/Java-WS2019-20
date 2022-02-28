package de.ovgu.icse.assignment04;

/**
 * Main class of the Java program. 
 * 
 */
 
import java.util.*;
import static org.hsqldb.lib.ArrayUtil.resizeArray;

public class Main {


    public static boolean isPalindrome (String str) {
        str=str.replaceAll("[^A-Za-z]+", "").toUpperCase();
        Stack stack=new Stack();
        String str_rev="";

        for(int i=0;i<str.length();i++)
            stack.push(str.charAt(i));
        while(!stack.isEmpty())
            str_rev=str_rev+stack.pop();
        if(str.equals(str_rev))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        //Testing Bus
       Bus A=new Bus(true,false);
       System.out.print("Number of Doors=" + A.getNumberOfDoors());
        A.unlockAllDoors();
        for (int i=0;i<A.getNumberOfDoors();i++)
            System.out.print("\nDoor" + i + "=" + A.getDoorState(i));
        A.lockAllDoors();
        for (int i=0;i<A.getNumberOfDoors();i++)
            System.out.print("\nDoor" + i + "=" + A.getDoorState(i));;

        //testing palindrome implementation
        System.out.print("\n" + "Is \"Hannah\" a palindrome:"+isPalindrome("Hannah"));
        System.out.print("\n" + "Is \"Madam, I’m Adam\" a palindrome:" + isPalindrome("Madam, I’m Adam"));
        System.out.print("\n" + "Is \"Rotator\" a palindrome:"+isPalindrome("Rotator"));
        System.out.print("\n" + "Is \"Elevator\" a palindrome:" + isPalindrome("Elevator"));
        System.out.print("\n" + "Is \"ICSE\" a palindrome:"+isPalindrome("ICSE"));
        System.out.print("\n" + "Is \"Learning Stacks\" a palindrome:"+ isPalindrome("Learning Stacks"));

        // Declare the default nodes
        LinkedNode<String> head;
        LinkedNode<String> trail1;
        LinkedNode<String> trail2;

        // Data of the default nodes
        String[] node_data = {
                "sleeping late",
                "attending a party",
                "going to bed"
        };

        // Define the nodes
        head = new LinkedNode<String>(node_data[0]);
        trail1 = new LinkedNode<String>(node_data[1]);
        trail2 = new LinkedNode<String>(node_data[2]);

        // Connect them
        head.setNextNode(trail1);
        trail1.setNextNode(trail2);

        // Check them
        // Output: sleeping late,attending a party,going to bed
        System.out.println('\n' + head.toText());

        // Add further items
        String[] new_data = {
                "visit the canteen",
                "attend a lecture",
                "tell heaven from hell",
                "blue skies from pain",
                "smile from a veil"
        };

        LinkedNode<String> new_head = new LinkedNode<String>(new_data[0]);
        LinkedNode<String> current = new_head;
        for (int i = 1; i < new_data.length; i++) {
            current.next_ = new LinkedNode<String>(new_data[i]);
            current = current.next_;
        }
        trail2.next_ = new_head;

        // Print the whole list again
        System.out.println(head.toText());


        // Create a list, now with weekdays
        LinkedNode<String> daysOfTheWeek = new LinkedNode<String>("Monday");
        daysOfTheWeek.setNextNode(new LinkedNode<String>("Thursday"));
        daysOfTheWeek.getNextNode().setNextNode(new LinkedNode<String>("Friday"));
        System.out.println(daysOfTheWeek.toText());
        LinkedNode<String> node_2 = daysOfTheWeek.getNextNode();

        daysOfTheWeek.setNextNode(new LinkedNode<String>("Tuesday"));
        daysOfTheWeek.getNextNode().setNextNode(new LinkedNode<String>("Wednesday"));
        daysOfTheWeek.getNextNode().getNextNode().setNextNode(node_2);

        // Print them all
        System.out.println(daysOfTheWeek.toText());
    }
}

