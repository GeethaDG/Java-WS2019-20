# Exercise 01 -- Java Basics

### SUBMISSION DEADLINE: **November 3, 2019 at 3 pm**    

The first exercise encompasses several small tasks to get familiar
with Java and programming basics in general. You can find the tasks in the following.
As a template for your solution, the class  `Main.java` has been created in the `src` folder of this repository, 
containing all methods with its corresponding signature.
**Use this template for your solution. Otherwise, we will account for a malus (i.e., reducing your points even if the solution is correct)!**

*RECOMMENDATION: Do not wait with working on the assignment until the deadline is approaching!*

## Tasks 1-01:  Armstrong Numbers

<table border="0">
  <tr>
   <td>
An Armstrong Number is a number that is the sum 
of its own digits, with each digit raised to the power of the number of digits.    

**Example:**

* 9 is an Armstrong number, because 9 = 9^1 = 9
* 10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
* 153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
* 154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190

Please write a Java method
     
```public static boolean isArmstrongNumber (int n)```

which determines as efficiently as possible whether a **natural number** *n* is an Armstrong Number or not. 
The method should return `true` if *n* is such a number, and `false` otherwise.    
**ADVICE:** Java provides a rich set of methods to convert numbers into Strings/characters
and vice versa. This may be of interest to solve this task.
</td>

<td> 3/3 Points</td>
  </tr>
</table>


## Task 1-02: Greatest Common Divisor


<table border="0">
<tr>
  <td>

The greatest common divisor (GCD) of two natural numbers is the greatest number that allows an integer division for *both* numbers.

**Example:**

* GCD(4,2) is 2, as both numbers can be divided by 2 but by no larger number
* GCD(9,6) is 3, as both numbers can be divided by 3 but by no larger number

Please write a Java method

```public static int greatestCommonDivisor (int num1, int num2)```

that determines and returns the GCD of the two numbers ``num1`` and ``num2``.
Also make sure that this method is robust enough to deal with invalid/illegal input values.
In this case, the method should return 0.
</td>
  <td>3/3 Points</td>
</tr>
<tr>
  <td>
    How could you test your function ``greatestCommonDivisor``? 
    Write a small (unit) test within your main method.
Note: The main method is not verified when submitting your solutions, but discussed during the exercise.

</td>
  <td>1/1 Point</td>
</tr>
</table>

## Task 1-03: Working with Arrays

<table border="0">
  <!-- ============ subtask 01 ============ -->
  <tr>
   <td>Please write a Java method
     
```public static int[] createRandom (int n)```

which takes the size of the *array n* which should be created within the method. 
The elements of the array should then be filled with random integers within the range from 5 to 99 (inclusively). 

Note: You may use the standard function `random` of the class *Math* for generating the random numbers. 
By using the command: 
    `int z = (int)(maxrand*Math.random());`
you can create a random number z between 0 and maxrand. (*0 <= z < maxrand*).

    
</td>
<td> 2/2 Points</td>
  </tr>
  <!-- ============ subtask 02 ============ -->  
<tr>
  <td>Please write a Java method

```public static String toString (int[] a)```

which shall return the elements of *array a* as a string. 

Example: An array, containing the numbers *1, 2 and 3* should be returned as the following String: *\[1,2,3\]*.    
Note: The squared bracket have to be added by you in any case.

Test your toString(…) method within your main function. Test it also using the predefined method java.util.Arrays.toString(...).

  </td>
  <td>2/2 Points</td>
</tr>
  <!-- ============ subtask 03 ============ -->
<tr>
  <td>	Please write a Java method 

```public static int posMin (int[] a)```

which yields the position of the smallest number in *array a*. If the minimal value occurs multiple times, returning the first occurrence is sufficient. 

  </td>
  <td>1/1 Point</td>
</tr>
  <!-- ============ subtask 04 ============ -->
<tr>
  <td>Please write a Java method

```public static void swap (int[] a)```

which swap the first and the last element within the *array a*.
  </td>
  <td>1/1 Point</td>
</tr>
<tr>
  <td align="right">Total Points</td>
    <td>13/13</td>
  </tr>
</table>
