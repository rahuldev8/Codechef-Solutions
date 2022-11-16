
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
	
	    for(int b=0;b<test;b++)
		{
		    int num = sc.nextInt();
		    int [] a = new int[num];
		    for(int i=0; i<num; i++){
		        a[i] = sc.nextInt();
		    }
		    int minimum=Integer.MAX_VALUE;
		    
		    for(int j=0;j<num;j++)
		    {
		      for(int k=0;k<num;k++)
		      {
		          if(j!=k)
		          {
		              if(Math.abs(a[j]-a[k])<minimum)
		              {
		                minimum=Math.abs(a[j]-a[k]);
		                
		              }
		          }
		      }
		    }
		    
		    System.out.println(minimum);
		}
	}
}
