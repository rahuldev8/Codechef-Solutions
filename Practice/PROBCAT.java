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
                if(1 <= n && n < 100)System.out.println("Easy");
                else if(100 <= n && n < 200)System.out.println("Medium");
                else if(200 <= n && n <= 300)System.out.println("Hard");
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
