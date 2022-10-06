/*
Chef has a string SS with him. Chef is happy if the string contains a contiguous
substring of length strictly greater than 22 in which all its characters are vowels.

Determine whether Chef is happy or not.

Note that, in english alphabet, vowels are a, e, i, o, and u.*/

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
		int te = sc.nextInt();
		for(int s=0;s<te;s++)
		{
		    String str = sc.next();
		    int count = 0;
		    for(int i=0;i<str.length();i++)
		    {
		        if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||
		        str.charAt(i) == 'o'||str.charAt(i) == 'u')
		        {
		            count++;
		            if(count>2)
		            {
		                 System.out.println("Happy");
		                 break;
		            }
		        }
		        else 
		        count = 0;
		    }
		    if(count<=2)
		    System.out.println("Sad");
		}
	}
}
