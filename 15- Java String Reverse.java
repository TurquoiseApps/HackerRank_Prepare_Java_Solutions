/*
problem: https://www.hackerrank.com/challenges/java-string-reverse/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // get the inputs
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result;
        
        // create a string builder and reverse the string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        // compare the original and the reversed strings and show the result
        result = s.equals(sb.toString())? "Yes": "No";
        System.out.println(result);
        
    }
    
    
}
