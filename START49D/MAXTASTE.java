import java.util.*;

class Codechef
{
    public static void main(String[] args)throws java.lang.Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test-->0)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                System.out.println(Math.max(a,b)+Math.max(c,d));
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
