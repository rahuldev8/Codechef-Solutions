import java.util.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test-->0)
            {
                int n = sc.nextInt();
                int[] prob = new int[n];
                int res = 0;
                for (int i=0; i<n; i++)
                {
                    prob[i] = sc.nextInt();
                    if(prob[i] < 1000)
                    {
                        res++;
                    }
                }
                System.out.println(n-res);
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
