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
                int money_had = sc.nextInt();
                int bill_amnt = sc.nextInt();
                if(bill_amnt <= money_had)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            
        } catch(Exception e) {
        } finally {return;
        }
    }
}
