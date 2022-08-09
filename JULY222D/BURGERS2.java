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
                int nor_price = sc.nextInt();
                int pre_price = sc.nextInt();
                int burgers = sc.nextInt();
                int amount = sc.nextInt();
                if((amount/nor_price) < burgers)
                {
                    System.out.println("-1");
                }
                else if((amount/pre_price) >= burgers)
                {
                    System.out.println("0"+" "+burgers);
                }
                else
                {
                    int A = pre_price * burgers;
                    int B = nor_price - pre_price;
                    int Cas = (amount-A)/B;
                    if((amount-A)%B != 0)
                    {
                        Cas+=1;
                    }
                System.out.println(Cas + " " + (burgers - Cas));    
                }
            }
        } catch(Exception e) {
            return;
        }
    }
}
