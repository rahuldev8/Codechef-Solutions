/*
Not everyone probably knows that Chef has younger brother Jeff. Currently Jeff learns to read.

He knows some subset of the letter of Latin alphabet. In order to help Jeff to study, Chef gave him a book with the text consisting of N words. Jeff can read a word iff it consists only of the letters he knows.

Now Chef is curious about which words his brother will be able to read, and which are not. Please help him!

Input
The first line of the input contains a lowercase Latin letter string S, consisting of the letters Jeff can read. Every letter will appear in S no more than once.

The second line of the input contains an integer N denoting the number of words in the book.

Each of the following N lines contains a single lowecase Latin letter string Wi, denoting the ith word in the book.

Output
For each of the words, output "Yes" (without quotes) in case Jeff can read it, and "No" (without quotes) otherwise.*/


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
		String org = sc.next();
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
		    String word = sc.next();
		    
		    int len = 0;
		    for(int j=0;j<org.length();j++)
		    {
		        for(int k=0;k<word.length();k++)
		        {
		            if(org.charAt(j) == word.charAt(k))len++;
		        }
		    }
		    System.out.println(len==word.length()?"Yes":"No");
		}
	}
}

//Time Complexity : o(n^3)
//Space Complexity: o(1)
