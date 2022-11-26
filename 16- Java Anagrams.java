/*
problem:
https://www.hackerrank.com/challenges/java-anagrams/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
            // get the inputs
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String result;
        
        // convert the strings into char arrays
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        
        // sort the two arrays, compare, and show the result
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        a = String.valueOf(array1);
        b = String.valueOf(array2);
        
        result = a.equals(b)? "Anagrams": "Not Anagrams";
        System.out.println(result);

        
    }
}
