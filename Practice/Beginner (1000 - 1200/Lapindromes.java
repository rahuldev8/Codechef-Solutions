/*
Lapindrome is defined as a string which when split in the middle,
gives two halves having the same characters and same frequency of each character.
If there are odd number of characters in the string, we ignore the middle character and check for lapindrome.
For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency.
Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves
contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0)
		{
		    String str=sc.next();
		    String left="";
		    String right="";
		    int len=str.length();
		    
		    
		    //checking if the length is even
		    if(len%2==0)
		    {
		        //splitting left string 
		        for(int j=0;j<len/2;j++)
		        {
		            left+=str.charAt(j);
		        }
		        //splitting right string
		        for(int j=(len/2);j<len;j++)
		        {
		            right+=str.charAt(j);
		        }
		    }
		    //for odd length strings
		    if(len%2!=0)
		    {
		        //populating left string
		        for(int j=0;j<len/2;j++)
		        {
		            left+=str.charAt(j);
		        }
		        //ignoring middle element and populating right string
		        for(int j=(len/2)+1;j<len;j++)
		        {
		            right+=str.charAt(j);
		        }
		    }
		    //Converting left and right strings to char Array
		    char[] arr1=left.toCharArray();
		    char[] arr2=right.toCharArray();
		    //Sorting the Arrays
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    
		    //Checking if Both are Equal
		    if(Arrays.equals(arr1,arr2))
		    {
		        System.out.println("YES");
		        continue;
		    }
		    System.out.println("NO");
		}  
	}
}
