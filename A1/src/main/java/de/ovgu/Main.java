package de.ovgu;
import java.util.Arrays;
import java.util.Scanner;



import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Main class of the Java program. 
 *
 */
public class Main {
    /*
    // Task 1-01: Armstrong number
     */
    public static boolean isArmstrongNumber(int a) {
        int count = 0, sum = 0, b = a, c = a, rem = 0;
        while (b != 0) {
            b = b / 10;
            count++;
        }
        while (a != 0) {
            rem = a % 10;
            a /= 10;
            sum = sum + (int) (Math.pow(rem, count));
        }
        if (sum == c) {
            return TRUE;
        } else {
            return FALSE;
        }
    }


    // Task 1-02: GCD

    public static int greatestCommonDivisor(int num1, int num2) {
        //your implementation goes here
        int GCD = 0;
        if (num1<=0||num2<=0){
            return 0;
        }
        else if (num1==num2){
            return num1;
        }
        else {
            for (int i = 1; i <= num1 && i <= num2; i++) {
                //check if i divides the number completely and set as GCD
                if (num1 % i == 0 && num2 % i == 0) {
                    GCD = i;
                }
            }
            return GCD;
        }
    }

    /*
    // Working with Arrays
     */
    public static int[] createRandom(int n) {
        //your implementation goes here
        int[] a = new int[n];
          for (int i = 0; i < n; i++) {
            int z = (int) ((95 * Math.random()) + 5);
            a[i] = z;
        }
        return a;
    }

    public static String toString (int[] a) {
      if (a==null) return "";
      else {
          int arrayLength = a.length;
          String arrayToString = "";
          for (int i = 0; i < arrayLength; i++) {
              if (i == 0) {
                  arrayToString = Integer.toString(a[i]);
              } else {
                  arrayToString = arrayToString + ", " + a[i];
              }
          }
          return "[" + arrayToString + "]";
      }

    }

    public static int posMin (int[] a) {
        int posMin=0, minNum;
        if(a.length==0)
            return -1;
        else
        {
            minNum=a[0];
            for(int i=0;i<a.length;i++){
                if (a[i]<minNum){
                    minNum=a[i];
                    posMin=i;
                }
            }
            return posMin;
        }

    }

    public static void swap (int[] a) {
    int temp;
    temp=a[0];
    a[0]=a[a.length-1];
    a[a.length-1]=temp;
    }

    public static void main(String[] args) {
        //Test your methods here
        int i = 1634,num1 = 20, num2 = 40,n = 10;
        int[] Random = createRandom(n),numArray = {},abc = {100, 80, 90, 2, 60, 40, 10};
        System.out.println(isArmstrongNumber(i));
        System.out.println(greatestCommonDivisor(num1, num2));
        System.out.print(Arrays.toString(Random));
        //Testing arrayToString procedure with inbuilt method Arrays.toString
        String Test = Arrays.toString(Random); // Inbuilt Method call
        String arrayToString = toString(Random); //Used Defined Method call
        if (arrayToString.equals(Test))
            System.out.print("True");
        else System.out.print("False");
        //End of Test
        System.out.println(posMin(abc));
        swap(abc);
    }
    }


