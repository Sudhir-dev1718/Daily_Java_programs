import java.util.*;
class taskmedthod2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter num");
		int n=sc.nextInt();
		
		System.out.println(" enter start");
		int start=sc.nextInt();
		
		System.out.println(" enter end");
		int end=sc.nextInt();
		
		display(n,start,end);
			
	}
	
	public static void display(int n,int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}