/*
Each pizza consists of 44 slices. There are NN friends and each friend needs exactly XX slices.

Find the minimum number of pizzas they should order to satisfy their appetite.*/

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
		    int k = sc.nextInt();
		    //if((n*k)%4==0) System.out.println(n*k/4);
		    //else System.out.println((n*k/4)+1);
		    System.out.println((n*k)%4==0?n*k/4:(n*k/4)+1);
		}
	}
}
