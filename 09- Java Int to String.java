/*
Problem statement:
https://www.hackerrank.com/challenges/java-int-to-string/problem

Problem
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print “Good job”. 
Otherwise it will print “Wrong answer”.

n can range between -100 to 100 inclusive.

Sample Input
 100
 
Sample Output
 Good job
 
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
   
    
    try{
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         String.valueOf(n);
         System.out.print("Good job");

       } catch (Exception e){
        
        System.out.print("Wrong answer");
        
        }
           
           
    }
}
