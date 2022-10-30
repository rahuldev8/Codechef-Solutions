/*
Chef likes to play table tennis. 
He found some statistics of matches which described who won the points in order. 
A game shall be won by the player first scoring 11 points except in the case when both players have 10 points each, 
then the game shall be won by the first player subsequently gaining a lead of 2 points. 
Could you please help the Chef find out who the winner was from the given statistics? 
(It is guaranteed that statistics represent always a valid, finished match.)

Input
The first line of the input contains an integer T, denoting the number of test cases. 
The description of T test cases follows. 
Each test case consist a binary string S, which describes a match. 
'0' means Chef lose a point, whereas '1' means he won the point.

Output
For each test case, 
output on a separate line a string describing who won the match. 
If Chef won then print "WIN" (without quotes), otherwise print "LOSE" (without quotes).
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
		    String stat = sc.next();
		    int win = 0;
		    int lose = 0;
		    
		    for(int i=0;i<stat.length();i++)
		    {
		        if(stat.charAt(i)=='1')win++;
		        else lose++;
		    }
		    System.out.println(win>lose?"WIN":"LOSE");
		    
		    //Time Complexity: o(n)
		    //Space Complexity: o(1)
		}
	}
}
