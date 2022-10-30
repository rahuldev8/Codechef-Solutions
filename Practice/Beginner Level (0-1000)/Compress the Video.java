/*
Chef recorded a video explaining his favorite recipe. However, the size of the video is too large to upload on the internet. He wants to compress the video so that it has the minimum size possible.

Chef's video has NN frames initially. The value of the i^{th}i 
th
  frame is A_iA 
i
 . Chef can do the following type of operation any number of times:

Choose an index ii (1\le i \le N)(1≤i≤N) such that the value of the i^{th}i 
th
  frame is equal to the value of either of its neighbors and remove the i^{th}i 
th
  frame.
Find the minimum number of frames Chef can achieve.*/

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
		    int[] frames = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        frames[i]=sc.nextInt();
		    }
		    if(n==1)System.out.println('1');//if frames length is only one, return 1
		    else
		    {
		        int tot_frames = n;//total number of frames assigned to a new variable
		        for(int j=1;j<n;j++)
		        {
		            if(frames[j]==frames[j-1])//if two of frames matches, decrement one frames from total frames
		            tot_frames--;
		        }
		        System.out.println(tot_frames);
		        
		        //Time Complexity : o(n)
		        //Space Complexity: o(1)
		    }
		}
	}
}
