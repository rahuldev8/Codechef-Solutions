/*
Vilgax is an intergalactic alien warlord and conqueror. He is out on a quest to destroy all the planets in the Silky Way Galaxy. There are 100100 planets in the Silky Way Galaxy arranged in a straight line numbered from 11 to 100100. Vilgax sends NN monsters across planets to destroy them. Given an array AA of size NN, where A_iA 
i
​
  denotes the initial planet where the i^{th}i 
th
  monster is located. The initial planets where monsters are located are already destroyed. Each monster can destroy PP planets in one hour. A monster can only travel in a straight line in any direction and will destroy all the planets in his path. A monster can travel only for HH hours after which it exhausts. Determine the number of safe planets that are not on the verge of destruction.
  
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
		    int n = sc.nextInt();
		    int p = sc.nextInt();
		    int h = sc.nextInt();
		    
		    int[] planets = new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        planets[i] = sc.nextInt();
		    }
		    
		    
		    boolean[] destroy = new boolean[100];
		    
		    int ans = 0;
		    
		    int dist = p * h;
		    
		    
		    for(int i=0;i<n;i++)
		    {
		        //left side monster can cover
		        int leftMax = Math.max(1, planets[i]-dist);
		        //right side monster can cover
		        int Rightmax = Math.min(100, planets[i]+dist);
		        
		        
		        //flagging as  true, if a monster can cover that planet
		        for(int j=leftMax; j<=Rightmax; j++)
		        {
		            destroy[j-1] = true;
		        }
		    }
		 
		    for(int i=0;i<100;i++)
		    {
		        if(!destroy[i])ans++;
		    }
		    
		    System.out.println(ans);
	}
	}
}
v
