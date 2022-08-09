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
                int week_days = sc.nextInt();
                int chill_day = sc.nextInt();
                System.out.println(week_days*4+chill_day);
            }
        } catch(Exception e) {
            return;
        }
    }
}
