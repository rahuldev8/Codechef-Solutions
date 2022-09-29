/*
There is a cricket match going on between two teams AA and BB.

Team BB is batting second and got a target of XX runs. Currently, team BB has scored YY runs. Determine how many more runs Team BB should score to win the match.

Note: The target score in cricket matches is one more than the number of runs scored by the team that batted first.*/

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
	        int y = sc.nextInt();
	        int x = sc.nextInt();
	        System.out.println(y-x);
	    }
	}
}
