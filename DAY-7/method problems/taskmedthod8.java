import java.util.*;
class taskmedthod8
{
	public static void main(String[] args)
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter len");
		int num=sc.nextInt();
		
		int copy=num;
		
		palindrom(num,copy);
		
	}
	
	public static void palindrom(int num,int copy)
	{
		int rev=0;
		int rem=0;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("rev value = "+rev);
		if(rev==copy)
		{
			System.out.print("it is palindrom");
		}
		
		else
		{
			System.out.print("it is not a palindrom");
		}
	}
}