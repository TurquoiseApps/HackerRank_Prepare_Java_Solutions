/*
problem: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
*/

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		// get the inputs
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T-->0)
        {
            String pattern = sc.nextLine();
            
            try
            {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (Exception e) 
            {
                System.out.println("Invalid");
            }
        }
        
        
        
        
        
	}
}



