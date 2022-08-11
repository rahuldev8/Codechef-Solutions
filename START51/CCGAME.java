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
               int num = sc.nextInt();
               int x = 0;
               int[] arr = new int[num];
               
                for (int i=num-1;i>=0;i--)
                {
                    arr[i] = sc.nextInt();
                    if(arr[i]%2 == 1) x^= i;
                }
                if(x == 0)System.out.println("Cook");
                else  System.out.println("Chef");
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
