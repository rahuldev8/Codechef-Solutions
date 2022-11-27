/*
In a far away Galaxy of Milky Way, there was a planet Mars where the sport of Competitive Coding was very popular. According to legends, there lived a setter known to give advanced array problems disguised as cakewalk problems.Now he challenged you to solve the given problem.

Chef have N piles of books ; for each i (1 ≤ i ≤ N), the i-th pile contains Ai books.

Suppose Chef has an reading speed of K books per hour. Each hour, chef will choose some pile of books. If this pile contains at least K books, then chef will read K books from it and remove them from the pile. Otherwise, chef will simply remove the whole pile (and won't read any book during this hour).

Chef would like to choose the minimum K such that chef is able to read all the books in H hours. Help Chef find that value of K.

*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean canEat(int h, int mid, int[] arr)
    //Here h is for, Deadline Hours, in which chef should able to read all books
    //mid is current K value
    //arr is the array, which contains deatils of piles of books
    {
        int res = 0;
        //for each loop for reading arr's details
        for(int i : arr)
        {
            int x = i/mid; //for reading multiple of k books
            int y = i%mid; //for calculaation minimum books
            
            res += x; //adding reading hours to result
            
            if(y!=0)res++;//for remaining extra books adding a single hour to result
        }
        //if res is less than or equal to given time, which means chef can able to read all the books return true, else false
        return res <= h;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test-->0)
		{
		    int n = sc.nextInt();
		    int h = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    
		    //Binary Search for minimum value K, let minimum value of k is 1, and max be Integer's max value. 
		    int slow = 1;
		    int fast = Integer.MAX_VALUE;
		    
		    //usual binary search format
		    while(slow <= fast)
		    {
		        //finding mid, without crossing int's range
		        int mid = slow + (fast - slow) / 2;
		        
		        //canEat, is a method which returns true, if chef can read all books in given time
		        if(canEat(h, mid, arr))
		        //if he can able to read all books in this K time, there might be a possiblity, that chef can read the books in less time, so decreasing the fast
		        fast = mid - 1;
		        //else given K time is not enough for chef to read, all books so, We have to increase the speed (Value of K)
		        else slow = mid + 1;
		    }
		    //Slow is the Minimum K value, which chef can read all the given books in given amount of time
		    System.out.println(slow);
		}
		
		//Time Complexity : o(M log N)
		//Space Complexity : o(1)
	}
}
