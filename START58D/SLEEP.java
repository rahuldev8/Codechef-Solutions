/*
A person is said to be sleep deprived if he slept strictly less than 77 hours in a day.

Chef was only able to sleep XX hours yesterday. Determine if he is sleep deprived or not*/

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
		    System.out.println(x<7?"YES":"NO");
		}
	}
}
