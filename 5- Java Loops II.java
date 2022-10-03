import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[][] arr = new int[t][3];
        int row = 0;
        
        
        // save the inputs in an array
        for(int i=0;i<t;i++){
        	
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int r=row; r<i+1; r++)
            {
                	arr[r][0]= a;
                	arr[r][1]= b;
                	arr[r][2]= n;
                	 row+=1;
            }
        }  
        
        
       // show the content of the array for testing purpose
      /*  System.out.println("The content of the array is:");
        for(int r=0; r<t; r++)
        {
        	for(int c=0; c<3; c++)
            {
            System.out.println(arr[r][c]);
            }
        }   */ 
        
        
        // read the elements of the array and calculate 
        for(int c=0; c<t; c++) {
        	int ra = arr[c][0];
        	int rb = arr[c][1];
        	int rn = arr[c][2];
        	
        	int total = ra;
            for(int j=0; j<rn; j++)
            {
             total += Math.pow(2, j)*rb;   
             System.out.print(Math.round(total)+" ");  
            
            }
            System.out.println("");
            
        }
        
        
        
    }
}
