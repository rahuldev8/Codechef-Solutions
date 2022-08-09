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
                int curr = sc.nextInt();
                int tar = sc.nextInt();
                int grow = sc.nextInt();
                System.out.println((tar-curr)/grow);
                
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
