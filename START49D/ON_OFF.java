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
                int num = sc.nextInt();
                String S = sc.next();
                String R = sc.next();
                int res = 0;
                for(int i=0;i<S.length();i++)
                {
                    if(S.charAt(i) != R.charAt(i))res++;
                }
                if(res == 1)System.out.println("0");
                else if(res == 0)System.out.println("1");
                else if(res%2 == 0)System.out.println("1");
                else System.out.println("0");
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
