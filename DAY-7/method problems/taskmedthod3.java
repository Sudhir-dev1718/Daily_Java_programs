import java.util.*;
class taskmedthod3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start");
		int start=sc.nextInt();
		
		System.out.println("enter start");
		int end=sc.nextInt();
		
		int count=0;
		evenCount(start,end,count);
		
		
		
	}
	public static void evenCount(int start,int end,int count)
	{
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		
		System.out.print(count);
	}
	
	
}