/*
Chef likes problems involving arrays. Unfortunately, the last one he tried to solve didn't quite get solved.

Chef has an array A of N positive numbers. He wants to find the number of subarrays for which the sum and product of elements are equal.

Please help Chef find this number.*/

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
		int n = sc.nextInt();
		int[] arr = new int[n];
		int res = 0, max= 0;
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		    if(arr[i] == 0) res = 0;
		    else res++;
		    
		    if(res>max) max = res;
		}
		System.out.println(max);
	}
}
