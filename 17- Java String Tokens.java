/*
the problem:
https://www.hackerrank.com/challenges/java-string-tokens/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        
        // get the inputs
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        //trim the string before evaluating it
        s = s.trim();
        if (s.length() == 0) 
        {
            System.out.println(0);
        } else 
        {
            // split the string and show the result
            String[] tokens = s.trim().split("[!,?._'@ ]+");
            System.out.println(tokens.length);
            
        for(String token: tokens) 
        {
            System.out.println(token);        
        }
        }
        
        

    }//main
}//class
