# Exercise 06 -- Hash Tables
### Submission Deadline: January 7, 2020 at 3 pm

In the sixth assignment, the tasks focus on the topic of **Hash Tables** (to be introduced in the Lecture on December 18, 2018).

For solving the tasks, this repository contains:

* a `src/main` Folder, containing *four* java files, providing the source code templates for your the particular tasks. These files serve as a starting point for your solution.
**IMPORTANT: Make use of the provided class for your solution. Also, do not change the method signature on your own (there is a good reason for the provided signatures). Otherwise, we will account for a malus (i.e., reducing your points even if the solution is basically correct)!**
* a `src/test` folder, containing the tests for the implementation. These tests are implemented by the instructor and can be used by you to improve your code. Also, these tests are kind of initial sanity check for assessing the assignment.
*Remember that you can run the test file(s) as well to check whether your implementation works correctly.*
**Do not touch them!**
* some more files needed for handling the project (or for proper push/pull the repository). See the slides for more details. In general, the other files **should not be changed or deleted, if you do not really know what you are doing**!!

In the following, you will find the particular tasks to be solved.

## Task 6-01: Comparing Linear and Quadratic Probing

<table border="0">
  <tr>
   <td>

We wish to build a Hash Table, which is able to deal with collision by using *linear and quadratic probing*.
Please write a `public class HashLinQuad` as follows:

```
public class HashLinQuad {
   private int[] table;        //hash table
   private int size;           //current number of elements          
   private int capacity        //capacity of the hash table
   
   private HashLinQuad (int size){
      table = new int[size];
   }

   public int addLin (int obj) { 
      …           //add obj into table using linear probing
   }
   
   public int addQuad (int obj){ 
      …          //add obj into table using quadratic probing
   }
   …
}
```
Implement the two methods `addLin` and `addQuad` that apply linear and quadratic probing, respectively.
</td>

<td>3 Points</td>
  </tr>
<tr>
  <td>
  
  Test your implemented methods `addLin` and `addQuad`. To this end, create the following two objects in class `Main`: 
  
  ```
	HashLinQuad linHashTable  = new HashLinQuad(1249);
	HashLinQuad quadHashTable = new HashLinQuad(1249);
  ```
   Please insert the *same* 1000 random integer values (in the same order) into:
   
   	a. the object `linHashTable` by using the method `addLin` and count the number of collisions.
   	b. the object `quadHashTable` by using the method `addQuad` and count the number of collisions.
  
 According to the results, compare and discuss both collision resolution strategies as a comment in your implementation (e.g., directly below the lines above).
  
  </td>
  <td>2 Points</td>
</tr>
</table>

## Task 6-02: Preparing the Food

We wish to build a Hash Table for fridge management, which is able to store Food objects

<table border="0">
  <tr>
   <td>

Please write a `public class Food` to describe a food object by different attributes. Think of useful attributes to compute a hash code for a Food object. Please *define five attributes* to describe a food object (including the first two, given below).

```
public class Food {
   private string         name; //name of the food          
   private string     category; //the category of food      
                                //(en.wikipedia.org/wiki/List_of_foods)
   private data type variable1; //attribute of your choice
   private data type variable2; //attribute of your choice
   private data type variable3; //attribute of your choice
   …
}
```
</td>

<td>1 Point</td>
  </tr>
<tr>
  <td>
  
Please implement *appropriate constructors* for the `public class Food` as well as a method `public void toString( )` that returns the attributes of a Food object as String.

</td>
  <td>1 Point</td>
</tr>
<tr>
  <td>
  
 Please implement a method `public int hashCode( )` to calculate a hash code of the `Food` object.
 
 **NOTE:** Do NOT reuse the method `hashCode()` from class `String` nor any other predefined method `hashCode()` from other classes/data types. Instead, think of an own method, based on the class `Food` (and all information therein), that is appropriate to avoid collisions.
  
  </td>
  <td>2 Points</td>
</tr>
</table>

## Task 6-03: Hash Table for Managing Food

<table border="0">
  <tr>
   <td>
   
   Please write another `public class HashFridge` to store and manage different Food objects **(by means of a Hash table)**.
   
   ```
   public class HashFridge{ … }
   ```
   Please implement *appropriate attributes and constructors* for the class `HashFridge`.
   
   </td>

<td>2 Points</td>
  </tr>
<tr>
  <td>
  
  Please implement the following function to insert food objects to a `HashFridge` object.
  ```
  public void insert(Food obj, int value){ … }
  ```
  The function should work in the following way:
  
  `insert(e, v)`:  
* use the hash function of `e` to generate an array index (i.e., a position in the array storing the objects) and store object `e` at this position in the table of objects  
* insert `v` (amount of the food object) as a value of `e` 
    to another hash table. In case of collision between different food objects (i.e., objects with different hash code result into the same index) resolve them with a collision resolution 
    strategy of your choice. (Use comments to give reasons for your choice of a resolution strategy)
*  **if** (a food object `e` exist in the hash table)  
   &ensp;&ensp;   increase amount of `e` by `v` in the corresponding hash table  
   **else**  
   &ensp;&ensp; amount of `e = v`
   
  </td>
  <td>3 Points</td>
</tr>
<tr>
  <td>

Please implement the following function to *search* for a `Food` object in a `HashFridge` object.
```
public int search(Food obj){ … }
```
The method should work in the following way:

`search(e)`: search for `e` in the hash table   
**if** (a food object `e` exist in the hash table)  
&ensp;&ensp; return the *amount* of `e`;  
**else**  
&ensp;&ensp; return -1;


</td>
  <td>3 Points</td>
</tr>
<tr>
  <td>
 
 Please implement the following function to *remove* a `Food` object in `HashFridge`.
 ```
 public int remove(Food obj, int value)){ … }
 ```
 The method should work in the following way:

 `remove(e, v)`: search for `e` in the hash table  
**if** (a food object `e` exist in the hash table)  
&ensp;&ensp;	**if** `v` < existing amount of `e`  
&ensp;&ensp;&ensp;&ensp;		decrease amount of `e` by `v`  
&ensp;&ensp;&ensp;&ensp;		**return** amount of `e`  
&ensp;&ensp;	**else if** `v == existing amount of e`                  
&ensp;&ensp;&ensp;&ensp;		remove `e` from the hash table  
&ensp;&ensp;&ensp;&ensp;		**return** 0  
**else**  
&ensp;&ensp;	**return** -1
  
  </td>
  <td>3 Points</td>
</tr>
<tr>
  <td>

Within the `main` function, please create **ten different** `Food` objects, which you insert into your `HashFridge`. 
Check your result by *printing the content* of your `HashFridge`. 
*Search* for some `Food` objects *and remove them* from your `HashFridge`. 
Check your result again by printing the content of your `HashFridge`.

</td>
    <td>1 Point</td>
</tr>
<tr>
  <td align="right">Total Points</td>
    <td>21</td>
</tr>
</table>

Good Luck!
