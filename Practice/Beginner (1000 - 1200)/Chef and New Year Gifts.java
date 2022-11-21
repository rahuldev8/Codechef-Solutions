/*
Chef wants to give his friends Alice and Bob some gift on the occasion of new year!

He visits a gift shop with nn gifts placed in row. The i^{th}i 
th
  gift has a price p_ip 
i
​
 . Chef doesn't want to give the same gift to both his friends. Yet he wants the gifts to be as equal as possible, in other words he wants the absolute difference between the prices of both gifts to be as less as possible.

Help Chef in determining the least absolute difference in prices of the gifts given to Alice and Bob.


*/


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test-->0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++)arr[i] = sc.nextInt();
		    
		    int min_diff = 0,ans=Integer.MAX_VALUE;
		    Arrays.sort(arr);
		    
		    for(int i=0;i<n-1;i++)
		    {
		        min_diff = Math.abs(arr[i]-arr[i+1]);
		        ans = Math.min(min_diff,ans);
		    }
		    System.out.println(ans);
		}
		//Time Complexity : o(n log n)
		//Space Complexity: o(1)
	}
}
