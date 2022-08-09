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
                int chef_buy_lamp = sc.nextInt();
                int bought_are_red = sc.nextInt();
                int red_cost = sc.nextInt();
                int blue_cost = sc.nextInt();
                
                if(chef_buy_lamp == bought_are_red)
                {
                    System.out.println(bought_are_red * red_cost);
                }
                else if(bought_are_red == 0)
                {
                    System.out.println(chef_buy_lamp*Math.min(red_cost,blue_cost));
                }
                else if(bought_are_red >= 1)
                {
                    System.out.println((bought_are_red*red_cost) + 
                    (chef_buy_lamp - bought_are_red) * Math.min(red_cost,blue_cost));
                }
            }
            
        } catch(Exception e) {
        } finally {return;
        }
    }
}
