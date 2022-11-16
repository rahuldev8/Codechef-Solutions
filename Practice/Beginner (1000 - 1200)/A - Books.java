
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
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    int[] b=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        if(i!=n-1)
		        {
		            int t=0;
		            for(int j=i+1;j<n;j++)
		            if(a[i]<a[j])
		            t++;
		            b[i]=t;
		           
		        }
		        else
		        b[i]=0;
		        System.out.print(b[i]+" ");
		    }
		    System.out.println();
		}
	}
}
