import java.util.*;
class taskmedthod5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		prime(num);
	}
	
	public static void prime(int num)
	{
		int flag=0;
		if(num==1)
		{
			System.out.print("it is prime");
			return;
		}
		if(num<0)
		{
			System.out.print("it is not prime");
			return;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
			}
		}
		
		if(flag==0)
		{
			System.out.print("it is prime");
		}
		
		else
		{
			System.out.print("it is  not prime");
		}
	}
}