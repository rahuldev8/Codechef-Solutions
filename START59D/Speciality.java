/*
On every CodeChef user's profile page, the list of problems that they have set, tested, and written editorials for, is listed at the bottom.

Given the number of problems in each of these 33 categories as X, Y,X,Y, and ZZ respectively (where all three integers are
distinct), find if the user has been most active as a Setter, Tester, or Editorialist.*/

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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    System.out.println(a>b?"Setter":b>c?"Tester":"Editorialist");
		}
	}
}
