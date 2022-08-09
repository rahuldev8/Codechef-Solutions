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
                int row = sc.nextInt();
                int coloumn = sc.nextInt();
                if(row%2==0)
                {
                    if(coloumn%2==0)
                    {
                        System.out.println("0");
                    }
                    else if(coloumn%2!=0)
                    {
                        System.out.println(row);
                    }
                }
                else if(row%2!=0)
                {
                    if(coloumn%2!=0)
                    {
                        System.out.println(row+coloumn-1);
                    }
                    else if(coloumn%2==0)
                    {
                        System.out.println(coloumn);
                    }
                }
            }
        } catch(Exception e) {
        } finally {
            return;
        }
    }
}
