/*
Chef is currently working as an intern at Toonpur Health Department. Recently he is assigned the task to identify healthy strings.

A string is considered healthy if, 
when split into two halves from the middle, the two halves have the same characters and the frequency of each character is also the same. 
If the string is of odd length, then the middle character is ignored and the string is split into two halves around the middle. 
For example, string "aefefa" is healthy as the two halves "aef" and "efa" have the same characters and frequency of each character is also the same. 
On the other hand, the string "defer" is not healthy as in the two halves "de" and "er", characters 'd' and 'r' do not match.

Chef is facing difficulty in identifying which string is healthy. Can you help him with this task?

Input Format
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains a single string SS consisting of lower case English alphabets.

Output Format
For each test case, output in a single line "YES" (without quotes) if the string is healthy or "NO" (without quotes) otherwise.*/

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
		    int flag = 1;
		    String str = sc.next();
		    int hash[] = new int[26];
		    int n = str.length();
		    if(n%2==0)//checking length is even
		    {
		        for(int i=0;i<n/2;i++)//traversing first half and storing frequency of each character in hash array
		        {
		            hash[str.charAt(i)-'a']++;
		        }
		        for(int i=n/2;i<n;i++)//traversing second half and storing frequency of each character in hash array
		        {
		            hash[str.charAt(i)-'a']--;
		        }
		    }
		    if(n%2!=0)//checking length is odd
		    {
		        for(int i=0;i<n/2;i++)//traversing first half and storing frequency of each character in hash array
		        {
		            hash[str.charAt(i)-'a']++;
		        }
		        for(int i=(n/2)+1;i<n;i++)//traversing second half(ignoring middle element) and storing frequency of each character in hash array
		        {
		            hash[str.charAt(i)-'a']--;
		        }
		    }
		    
		    for(int i=0;i<25;i++)//if str is lapindrome, all values in hash must be 0
		    {
		        if(hash[i]!=0)
		        flag = 0;
		    }
		    
		    System.out.println(flag==1?"YES":"NO");
		    
		    //Time Complexity: o(n)
		    //Space Complexity: o(1)
		}
	}
}
