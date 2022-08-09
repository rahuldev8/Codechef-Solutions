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
                int x = sc.nextInt();
                int y = sc.nextInt();
                int diff = Math.abs(x-y);
                System.out.println((diff/2)+(diff%2));
            }
        } catch(Exception e) {
            return;
        }
    }
}
