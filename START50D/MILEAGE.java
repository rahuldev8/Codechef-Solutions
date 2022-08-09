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
                float dist = sc.nextInt();
                float pet_cost = sc.nextInt();
                float dis_cost = sc.nextInt();
                float pet_mil = sc.nextInt();
                float dis_mil = sc.nextInt();
                float petrol = (dist*(pet_cost/pet_mil));
                float diesel = (dist*(dis_cost/dis_mil));
                if(petrol < diesel)System.out.println("PETROL");
                else if(petrol == diesel)System.out.println("ANY");
                else System.out.println("DIESEL");
            }
        } catch(Exception e) {
            return;
        }
    }
}
