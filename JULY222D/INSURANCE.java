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
                int rebat = sc.nextInt();
                int repair = sc.nextInt();
                System.out.println(Math.min(rebat,repair));
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
