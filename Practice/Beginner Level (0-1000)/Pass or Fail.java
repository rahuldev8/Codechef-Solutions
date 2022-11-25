/*
Chef is struggling to pass a certain college course.

The test has a total of NN question, each question carries 33 marks for a correct answer and -1−1 for an incorrect answer. Chef is a risk-averse person so he decided to attempt all the questions. It is known that Chef got XX questions correct and the rest of them incorrect. For Chef to pass the course he must score at least PP marks.

Will Chef be able to pass the exam or not?

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
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int p = sc.nextInt();
		    
		    System.out.println(x*3 + (n-x)*-1 >= p?"PASS":"FAIL");
		    
		    //Time Complexuty : o(1)
		    //Space Complexity : o(1)
		}
	}
}
