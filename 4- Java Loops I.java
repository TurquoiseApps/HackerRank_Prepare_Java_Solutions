/*
Problem Statement:
https://www.hackerrank.com/challenges/java-loops-i/problem

In this challenge, we're going to use loops to help us do some simple math.
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
        for(int c=1; c<=10; c++)
        {
            System.out.printf("%d x %d = %d%n", N, c, N*c);
        }
        
    }
}
