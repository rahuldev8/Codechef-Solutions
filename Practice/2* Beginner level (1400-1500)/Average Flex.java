/*
There are NN students in a class, where the ii-th student has a score of A_iA 
i
​
 .

The ii-th student will boast if and only if the number of students scoring less than or equal A_iA 
i
​
  is greater than the number of students scoring greater than A_iA 
i
​
 .

Find the number of students who will boast.
*/


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
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int ans = 0, less, more;
		    
		    //brute forcing to check how many values are greater and smaller than current value
		    for(int i=0;i<n;i++)
		    {
		        less=0;
		        more=0;
		        for(int j=0;j<n;j++)
		        {
		            if(arr[j]<=arr[i])less++;
		            else more++;
		        }
		        //if less is larger then, ans++(as per question)
		        if(less>more)ans++;
		    }
		    System.out.println(ans);
 		}
	}
	//Time Complexity : o(n^2)
	//Space Complexity : o(1)
}
