import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0)
		{
			int a = sc.nextInt();
			int[] arr = new int[a];
			for (int i = 0; i <a; i++) 
			{
				arr[i] = sc.nextInt();
			}
			System.out.println(istam(arr));
		}
		sc.close();
	}
	static long istam(int[] n)
	{
		return (long) n.length * (n.length - 1) / 2;
	}
}
