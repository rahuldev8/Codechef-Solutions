/*
The annual snake festival is upon us, and all the snakes of the kingdom have gathered to participate in the procession. Chef has been tasked with reporting on the procession, and for this he decides to first keep track of all the snakes. When he sees a snake first, it'll be its Head, and hence he will mark a 'H'. The snakes are long, and when he sees the snake finally slither away, he'll mark a 'T' to denote its tail. In the time in between, when the snake is moving past him, or the time between one snake and the next snake, he marks with '.'s.

Because the snakes come in a procession, and one by one, a valid report would be something like "..H..T...HTH....T.", or "...", or "HT", whereas "T...H..H.T", "H..T..H", "H..H..T..T" would be invalid reports (See explanations at the bottom).

Formally, a snake is represented by a 'H' followed by some (possibly zero) '.'s, and then a 'T'. A valid report is one such that it begins with a (possibly zero length) string of '.'s, and then some (possibly zero) snakes between which there can be some '.'s, and then finally ends with some (possibly zero) '.'s.

Chef had binged on the festival food and had been very drowsy. So his report might be invalid. You need to help him find out if his report is valid or not.

Input
The first line contains a single integer, RR, which denotes the number of reports to be checked. The description of each report follows after this.
The first line of each report contains a single integer, LL, the length of that report.
The second line of each report contains a string of length LL. The string contains only the characters '.', 'H', and 'T'.
Output
For each report, output the string Valid or Invalid in a new line, depending on whether it was a valid report or not.*/

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
		    int size = sc.nextInt();
		    String snake = sc.next();
		    
		    int ans = 0;
		    for(int i=0;i<size;i++)
		    {
		        if(snake.charAt(i) == 'H')ans++;
		        if(snake.charAt(i) == 'T')ans--;
		        
		        if(ans == -1 || ans == 2)break;
		    }
		    System.out.println(ans==0?"Valid":"Invalid");
		}
	}
}

//Time Complexity : o(n)
//Space Complexity : o(1)
