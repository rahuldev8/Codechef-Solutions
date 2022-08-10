import java.util.*;

class Solution
{
    public void result(int[] problems)
    {
        int count = 0;
        for (int i=0;i<4;i++)
        {
            if(problems[i] >= 10)
            count++;
        }
    System.out.println(count);    
    }
}

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            int[] problems = new int[4];
            for (int i=0; i<4; i++)
            {
                problems[i] = sc.nextInt();
            }
            Solution sol = new Solution();
            sol.result(problems);
            
        } catch(Exception e) 
        {
            return;
        }
    }
}
