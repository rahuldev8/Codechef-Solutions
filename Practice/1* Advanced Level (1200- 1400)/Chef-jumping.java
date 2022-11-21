/*
This morning Chef wants to jump a little. In a few minutes he will arrive at the point 0. Then he will perform a lot of jumps in such a sequence: 1-jump, 2-jump, 3-jump, 1-jump, 2-jump, 3-jump, 1-jump, and so on.

1-jump means that if Chef is at the point x, he will jump to the point x+1.

2-jump means that if Chef is at the point x, he will jump to the point x+2.

3-jump means that if Chef is at the point x, he will jump to the point x+3.

Before the start Chef asks you: will he arrive at the point a after some number of jumps?

*/

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
		long num = sc.nextLong();
		//Complete sequence of 3 jumps will result in 6 points, hence taking modulo with 6
    
    
		//if chef is in end position, he's score will be im multiples of 0 and 6 (results in 0)
    
		//if chef is in second position and he wants to jump to third then, the result of num%6 will ba always 3. (results in 3)
    
		//if is in start position, then he will jump only one unit(results in 1)
		
		if(num%6 == 3 || num%6 == 0 || num%6 == 1)System.out.println("yes");
		else System.out.println("no");
		
		//Time Complexity : o(1)
		//Space Complexity : o(1)
	}
}
