/*
There are NN cards on a table, out of which XX cards are face-up and the remaining are face-down.

In one operation, we can do the following:

Select any one card and flip it (i.e. if it was initially face-up, after the operation, it will be face-down and vice versa)
What is the minimum number of operations we must perform so that all the cards face in the same direction (i.e. either all are face-up or all are face-down)?*/

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
		    int tot = sc.nextInt();
		    int up = sc.nextInt();
		    if(tot == up || up == 0)System.out.println("0");
		    else
		    System.out.println(Math.min(tot-up,up));
		}
	}
}
