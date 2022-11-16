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
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		    int count1=0;
		    int count2=0;
		    int j=0;
		    while(j<n-1){
		        for(int k=j+1;k<n;k++){
		            if(arr[k]<arr[j]) count1++;
		        }
		        j++;
		    }
		    for(int i=0;i<n-1;i++){
		        if(arr[i]>arr[i+1]) count2++;
		    }
		    if(count1==count2) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
