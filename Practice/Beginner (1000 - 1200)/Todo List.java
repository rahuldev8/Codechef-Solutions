/*
Chef has made a To-Do list: a list of all the pending tasks that he has to complete. The list is in the increasing order of time taken to finish the tasks. Chef begins from the starting of the list.

Given an array AA of size NN denoting the list of the pending tasks. Each task is an integer between 11 and NN. The tasks numbered from 11 to 77 are classified as top priority tasks. Chef needs to know the minimum number of tasks he has to complete in order to get all the top priority tasks accomplished. Can you help him to do so?

Input Format
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains a single integer NN.
The second line contains NN space-separated integers A_1, A_2,
Output Format
For each test case, print a single line containing one integer ― the minimum number of tasks Chef needs to complete.*/

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
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int count = 0;
		    int ans = 0;
		    
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i] == 1 ||arr[i] == 2 ||arr[i] == 3 ||arr[i] == 4 ||
		        arr[i] == 5 ||arr[i] == 6 ||arr[i] == 7)
		        count++;
		        if(count == 7)
		        {
		            ans = i+1;
		            break;
		        }
		    }
		    System.out.println(ans);
		    
		}
	}
}

//Time Complexity : o(n)
//Space Complexity : o(1)
