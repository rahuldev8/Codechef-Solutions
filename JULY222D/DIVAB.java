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
                int x;
                int a_Num = sc.nextInt();
                int b_Num = sc.nextInt();
                int s_Num = sc.nextInt();
                
                if(a_Num % b_Num == 0)
                {
                    System.out.println(-1);
                    continue;
                }                

                x = s_Num;
                if(x%a_Num != 0)
                {
                    x = s_Num+ a_Num -(s_Num%a_Num);
                }
                
                while(!((x%a_Num == 0) && (x%b_Num != 0)))
                {
                    x+=a_Num;
                }

                System.out.println(x);                
            }
        } catch(Exception e) {

        }
    }
}
