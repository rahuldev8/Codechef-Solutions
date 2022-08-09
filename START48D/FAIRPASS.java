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
                int friends = sc.nextInt();
                int passes = sc.nextInt();
                friends += 1;
                if(passes >= friends)
                {
                    System.out.println("YES");
                }    
                else
                {
                    System.out.println("NO");
                }

            }
            
        } catch(Exception e) {
        } finally 
        {
            return;
        }
    }
    
}
