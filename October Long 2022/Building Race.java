/*
Two friends Chef and Chefina are currently on floors AA and BB respectively.
They hear an announcement that prizes are being distributed on the ground floor and so decide to reach the ground floor as soon as possible.

Chef can climb down XX floors per minute while Chefina can climb down YY floors per minute.
Determine who will reach the ground floor first. In case both reach the ground floor together, print Both.*/


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
		    float chef_flr = sc.nextInt();
		    float chefina_flr = sc.nextInt();
		    float chef_spd = sc.nextInt();
		    float chefina_spd = sc.nextInt();
		    System.out.println(chef_flr/chef_spd==chefina_flr/chefina_spd?"Both":
		    chef_flr/chef_spd>chefina_flr/chefina_spd?"Chefina":"Chef");
		}
		
	}
}


