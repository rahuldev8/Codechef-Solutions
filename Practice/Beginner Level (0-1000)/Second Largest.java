/*
Three numbers A, B and C are the inputs. Write a program to find second largest among them.*
/

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test-->0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    int max = Math.max(Math.max(a,b),c);
		    int min = Math.min(Math.min(a,b),c);
		    
		  //  if(a!=max && a!=min)System.out.println(a);
		  //  if(b!=max && b!=min)System.out.println(b);
		  //  if(c!=max && c!=min)System.out.println(c);
		  
		  System.out.println(a!=max && a!=min?a:b!=max && b!= min?b:c);
		  
		  //Time Complexity : o(1)
		  //Space Complexity : o(1)
		}
	}
}
