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
                int w = sc.nextInt();
                if(w > 20)System.out.println("HOT");
                else
                System.out.println("COLD");
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
