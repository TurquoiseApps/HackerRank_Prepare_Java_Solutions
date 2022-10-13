/*
Problem statment:
https://www.hackerrank.com/challenges/java-if-else/problem

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.
An if-else statement has the following logical flow:

Task
Given an integer, n, perform the following conditional actions :

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

Input Format
A single line containing a positive integer, n.

Constraints
1 <= n <= 100

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

Sample input 0
3
 
Sample output 0
Weird
 
Sample input 1
24
 
Sample output 1
Not Weird

Explanation
Sample Case 0: n=3, where n is odd and odd numbers are weird, so we print Weird.
Sample Case 1: n=24, where n>20 and n is even, so it isn’t weird. Thus, we print Not Weird.
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        if(N%2==0){
            if(N<=5 && N>=2){
                System.out.print("Not Weird");
                
            } else if(N<=20 && N>=6){
                System.out.print("Weird");
                
            } else if(N>20){
                System.out.print("Not Weird");
            }
           
        } else{
            System.out.print("Weird");
        }
        
        
    }
}
