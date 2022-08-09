import java.util.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test > 0)
            {
                int hours = sc.nextInt();
                System.out.println((hours*60)/20);
            }
        } catch(Exception e) {
        } finally {return;
        }
    }
}
