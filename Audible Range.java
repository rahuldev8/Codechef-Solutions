/*
Chef's dog binary hears frequencies starting from 6767 Hertz to 4500045000 Hertz (both inclusive).

If Chef's commands have a frequency of XX Hertz, find whether binary can hear them or not.*/

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
		    if(x>=67 && x<=45000)System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
