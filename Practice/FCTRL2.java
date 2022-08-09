/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.math.*;
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
		    int num = sc.nextInt();
		    BigInteger res = new BigInteger("1");
		    for (int i=2; i<=num; i++)
		    {
		        res = res.multiply(BigInteger.valueOf(i));
		    }
		    System.out.println(res);
		}
	}
}
