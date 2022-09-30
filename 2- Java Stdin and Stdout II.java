/*
Problem statement: 
https://www.hackerrank.com/challenges/java-stdin-stdout/problem

In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. 
To make the problem a little easier, a portion of the code is provided for you in the editor.

NOTE:
Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens;
because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() 
will be reading the remainder of the integer line (which is empty).
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
   // take the inputs
   Scanner sc = new Scanner(System.in);
   int i =  sc.nextInt();
   double d = sc.nextDouble();
   sc.nextLine();
   String s=sc.nextLine();
   
   // show the outputs
   System.out.println("String: "+s);
   System.out.println("Double: "+d);
   System.out.println("Int: "+i);
   
   
   
    }
}
