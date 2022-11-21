/*
There are 100 houses located on a straight line. The first house is numbered 1 and the last one is numbered 100. Some M houses out of these 100 are occupied by cops.

Thief Devu has just stolen PeePee's bag and is looking for a house to hide in.

PeePee uses fast 4G Internet and sends the message to all the cops that a thief named Devu has just stolen her bag and ran into some house.

Devu knows that the cops run at a maximum speed of x houses per minute in a straight line and they will search for a maximum of y minutes. Devu wants to know how many houses are safe for him to escape from the cops. Help him in getting this information.

*/


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
		    int Cop_houses = sc.nextInt();
		    int run_speed = sc.nextInt();
		    int max_search_time = sc.nextInt();
		    
		    int[] cop_house_numbers = new int[Cop_houses];
		    
		    for(int i=0;i<Cop_houses;i++)
		    {
		        cop_house_numbers[i] = sc.nextInt();
		    }
		    
		    //Bool arary to keep track, that cop can cover or not...
		    boolean[] safe_house = new boolean[100];
		    //safe house number that devu can reside
		    int ans = 0;
		    //max distance that a cop can cover
		    int dist = run_speed * max_search_time;
		    
		    
		    //each cop's ,aximum covering distance on their either side
		    for(int i=0;i<Cop_houses;i++)
		    {
		        //left side he can cover
		        int leftMax = Math.max(1, cop_house_numbers[i]-dist);
		        //right side he can cover
		        int Rightmax = Math.min(100, cop_house_numbers[i]+dist);
		        
		        
		        //flagging as  true, if a cop can cover that house
		        for(int j=leftMax; j<=Rightmax; j++)
		        {
		            safe_house[j-1] = true;
		        }
		    }
		    
		    //iterating through the safe_house array, if any false found(cop cannot cover) increment the ans value
		    for(int i=0;i<100;i++)
		    {
		        if(!safe_house[i])ans++;
		    }
		    
		    System.out.println(ans);
		}
	}
	//Time Complexity : o(n^2)
	//Space Complexity : o(n)
}
