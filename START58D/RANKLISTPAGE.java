/*
Chef participated in a contest and got a rank XX.

Chef is trying to find his name in the ranklist but there are too many pages.

Each page consists of 2525 participants. Chef wants to find the exact page number which contains his name.
Help Chef find the page number.*/

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
		    int x = sc.nextInt();
		    if(x%25 == 0) System.out.println(x/25);
		    else
		    {
		        System.out.println((x/25)+1);
		    }
		}
	}
}
