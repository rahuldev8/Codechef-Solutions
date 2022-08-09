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
                int tot_candy = sc.nextInt();
                int pockets = sc.nextInt();
                int poc_cap = sc.nextInt();
                
                if (tot_candy%(poc_cap*pockets) != 0)
                {
                    System.out.println(tot_candy/(pockets*poc_cap)+1);
                }
                else
                {
                    System.out.println((tot_candy)/(pockets*poc_cap));
                }
            }
            
        } catch(Exception e) {
        } finally {
            return;
        }
    }
}
