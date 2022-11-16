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
		while(test-->0){
		    int an = sc.nextInt();
		    
		    int arr[] = new int[an];
		    
		    for(int i = 0 ;i<an; i++){
		        arr[i] = sc.nextInt();
		    }
		    int x = sc.nextInt();
		    int num=arr[x-1];
		    Arrays.sort(arr);
		    for(int i = 0 ; i<an; i++){
		        if(arr[i]==num){
		        System.out.println(i+1);}
		    
		}}
	}
}
