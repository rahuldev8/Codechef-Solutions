/*
Mathison recently inherited an ancient papyrus that 
contained some text. Unfortunately, the text was not a pangram. Now, Mathison has a particular
liking for holoalphabetic strings and the text bothers him. The good news is that Mathison can buy letters from the local 
store in order to turn his text into a pangram.

However, each letter has a price and Mathison is not very rich. Can you help Mathison find the cheapest way to obtain a pangram?*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0){
		    
		    //array to store prices of each letters
		    int price[]=new int[26];
		    //getting the price of each element
		    for(int i=0;i<26;i++)
		        price[i] = sc.nextInt();
		        
		    String str = sc.next();
		    int ans=0;
		    //changing the values of available characters to 0, thus we can
		    //add up all the values to get the price he need to pay..
	         for(int i=0;i<str.length();i++){
	             price[str.charAt(i)-'a']=0;
	         }
	         
	         //adding up the prices(includes 0)
	         for(int i=0;i<26;i++){
	             ans+=price[i];
	         }
	         System.out.println(ans);
		}
	}
}
