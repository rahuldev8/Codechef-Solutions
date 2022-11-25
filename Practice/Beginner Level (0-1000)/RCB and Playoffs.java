/*
Team RCB has earned XX points in the games it has played so far in this year's IPL. To qualify for the playoffs they must earn at least a total of YY points. They currently have ZZ games left, in each game they earn 22 points for a win, 11 point for a draw, and no points for a loss.

Is it possible for RCB to qualify for the playoffs this year?

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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    System.out.println(x+z*2 >=y?"Yes":"No");
		    
		    //Time Complexity : o(1)
		    //Space Complexity : o(1)
		}
	}
}
