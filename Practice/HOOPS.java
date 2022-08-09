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
                if(n==1)System.out.println("1");
                else
                {
                    System.out.println((n/2)+1);
                }
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
