/*
Problem Statement:
https://www.hackerrank.com/challenges/java-output-formatting/problem

Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
            for(int c=0;c<3;c++)
            {
                String s = sc.next();
                int i = sc.nextInt();
                
                System.out.printf("%-15s%03d%n",s,i);
            }
            System.out.println("================================");
    }
}
