/*
problem: https://www.hackerrank.com/challenges/java-strings-introduction/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         System.out.println(A.length()+B.length());
          int value = A.compareTo(B);
          String result = (value>0?"Yes":"No");
          System.out.println(result);
          
          String upperCasedA = A.substring(0,1).toUpperCase()+A.substring(1);      
          String upperCasedB = B.substring(0,1).toUpperCase()+B.substring(1);      
          
          System.out.println(upperCasedA+" "+upperCasedB);
                
        
    }
}



