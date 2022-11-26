/*
problem: https://www.hackerrank.com/challenges/java-string-compare/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
           // get the inputs
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String smallest="", largest="";
        int size=0;
        
        // split the substrings and add it to the list
        ArrayList<String> mList = new ArrayList<String>();
        for(int i=0; i<s.length()-(k-1); i++) 
        {
            mList.add(s.substring(i,i+k));
            size++;
        }
        
        // convert the list to an array 
        String[] mArray= new String[size];
        mArray = mList.toArray(mArray);
        
        // sort the array
        Arrays.sort(mArray);
        
        // output the results
        System.out.println(mArray[0]);
        System.out.println(mArray[size-1]);

      
        
        
    }
}
