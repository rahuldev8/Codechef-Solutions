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
                int n = sc.nextInt();
                int l,r;
                l = r = 0;
                int[] arr = new int[1001];
                arr[1] = 0;
                
                for(int i=2;i<=n;i++)
                {
                    if(i%2==0) arr[i] = --l;
                    else arr[i] = ++r;
                }
                
                for (int i=1;i<=n;i++)
                {
                    System.out.print(arr[i]-l+1 + " ");
                }
                System.out.println();
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
