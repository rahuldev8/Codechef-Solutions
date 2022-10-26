/*
Chef usually likes to play cricket, but now,
he is bored of playing it too much, so he is trying new games with strings
. Chef's friend Dustin gave him binary strings SS and RR, each with length NN, and told 
him to make them identical. However, unlike Dustin, Chef does not have any superpower and Dustin lets Chef perform
only operations of one type: choose any pair of integers (i, j)(i,j) such that 1 \le i, j \le N1≤i,j≤N and swap the ii-th 
and jj-th character of SS. He may perform any number of operations (including zero).

For Chef, this is much harder than cricket and he is asking for your help. Tell him whether it is possible
to change the string SS to the target string RR only using operations of the given type.
*/

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
		    int len = sc.nextInt();
		    String S = sc.next();
		    String R = sc.next();
		    int sans = 0, rans = 0;
		    
		    //checking the number of 1 is equal in both given strings
		    //if so Output true, else false
		    for(int i=0;i<len;i++)
		    {
		        char sval = S.charAt(i);
		        char rval = R.charAt(i);
		        if(sval == '1')sans++;
		        if(rval == '1')rans++;
		    }
		    
		    if(sans == rans)System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
