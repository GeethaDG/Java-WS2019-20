package de.ovgu.icse.assignment02;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static int num_of_recursions=0;
    public static int collatzRecursive(int num) {
        num_of_recursions++;
        if(num<0 || num==0){return 0;}
        else if(num==1){return 1;}
        else if(num%2==0){return 1+collatzRecursive(num/2);}
        else if(num%2!=0){return 1+collatzRecursive(3*num+1);}
        else{return 0;}
    }

    public static int collatzIterative(int num) {
        int count=0;
        if(num==0||num<0){return 0;}
        else if(num==1){return 1;}
        else{
            while(num!=1){
                if(num%2==0){num=num/2;count+=1;}
                else{num=3*num+1;count+=1;}
            }
            return count+1;
        }
    }

    public static void main(String[] args) {

        int a=23,i=0;
        int b=collatzIterative(a);
        System.out.print("recursive computation of a num:=" + collatzRecursive(a) + "\n");
        System.out.print("iterative computation of a num:=" + b + "\n");
        //Testing for number iterations and recursive
        System.out.print(" Validation with a global variable " + num_of_recursions + "\n");
        System.out.print("Number of iterations:=" + b);
    }
}
