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
                String bin = Integer.toBinaryString(num);
                
                int count = 0;
                for(int i=0;i<bin.length();i++)
                {
                    if(bin.charAt(i) == '1')count++;
                }
                System.out.println(count-1);
            }
            
        } catch(Exception e) {
            return;
        }
    }
}
