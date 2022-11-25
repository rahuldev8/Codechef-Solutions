/*
Chef has finally got the chance of his lifetime to drive in the F1F1 tournament. But, there is one problem. Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.

Given the fastest finish time as XX seconds and Chef's finish time as YY seconds, determine whether Chef will be allowed to race in the main event or not.

Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time.
*/

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test-->0)
		{
		    double x = sc.nextInt();
		    double y = sc.nextInt();
		    System.out.println(x*1.07>=y?"YES":"NO");
		    //Time Complexity : o(1)
		    //Space Complexity : o(1)
		}
	}
}
