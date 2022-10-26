/*
Chef has bought a new robot, which will be used for delivering dishes to his customers.
He started testing the robot by letting it move on a line.

Initially, the robot is placed at the coordinate x = Xx=X.
Then, it should execute a sequence of NN commands, described by a string SS with length NN. 
Each character of this string is either 'L' or 'R', denoting that the robot should walk one step to the left
(decreasing xx by 11) or to the right (increasing xx by 11), respectively.

How many distinct points are visited by the robot when it has executed all the commands? A point 
pp is visited by the robot if pp is an integer and the robot's position before or after executing some command is x = px=p.*/

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
		    //Input Command Length to Robot
		    int comm_len=sc.nextInt();
		    //Initail Position of Robot
		    int ini_pos=sc.nextInt();
		    
		    //Input Command to Robot
		    String str=sc.next();
		    
		    //Initializing left and right variables to initail pos of robot
		    int left=ini_pos;
		    int right=ini_pos;
		    
		    for(int i=0;i<comm_len;i++)
		    {
		        //if the command is right we have to increment the initial pos
		        if(str.charAt(i)=='R')
		        {
		           ini_pos++;
		        }
		        //if the command s left we have to decrement the initial pos
		        if(str.charAt(i)=='L')
		        {
		            ini_pos--;
		        }
		        //left should be less than ini_pos
		        if(left<ini_pos)
		        {
		            left=ini_pos;
		        }
		        //right should be greater than ini_pos
		        if(right>ini_pos)
		        {
		            right=ini_pos;
		        }
		        
		    }
            System.out.println(left-right+1);
		   
		    
		}
	}
}
