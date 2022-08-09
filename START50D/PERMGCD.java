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
                int x = sc.nextInt();
                if(x<n)
                {
                    System.out.println("-1");
                    continue;
                }
                System.out.print(x-n+1+" ");
                for(int i=1;i<=n;i++)
                {
                    if(i != (x-n+1))System.out.print(i+" ");
                }
                System.out.println();
            }
        } catch(Exception e) {
            return;
        }
    }
}
