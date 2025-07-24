import java.util.*;
class taskmedthod7
{
	public static void main(String[] args)
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter len");
		int len=sc.nextInt();
		
		System.out.println("enter n1");
		int n1=sc.nextInt();
		
		System.out.println("enter n2");
		int n2=sc.nextInt();
		
		int n3=0;
		
		fibinacii(n1,n2,n3,len);
		
	}
	
	public static void fibinacii(int n1,int n2,int n3,int len)
	{
		
		
		for(int i=1;i<=len;i++)
		{
		n3=n1+n2;	
		System.out.println(n1);
		n1=n2;
		n2=n3;
		}
	}
}