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
                int X = sc.nextInt();
                int[] arr = new int[200001];
                int[][] mul_arr = new int[200001][2];
                
                for (int i=1;i<=num; ++i)
                {
                    arr[i] = sc.nextInt();
                }
                
                for(int i=2;i<=num; ++i)
                {
                    mul_arr[i][0]=Math.max(mul_arr[i-1][0]+(arr[i-1]^arr[i]),mul_arr[i-1][1]+((arr[i-1]+X)^arr[i]));
                    
                    mul_arr[i][1]=Math.max(mul_arr[i-1][0]+(arr[i-1]^(arr[i]+X)),mul_arr[i-1][1]+((arr[i-1]+X)^(arr[i]+X)));
                }
                System.out.println(Math.max(mul_arr[num][0],mul_arr [num][1]));
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
