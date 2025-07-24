import java.util.*;

	class taskmedthod1
	{
		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter start ");
		int n1=sc.nextInt();
		System.out.println("enter end");
		int n2=sc.nextInt();
		rev(n1,n2);
		
	}
	
	
	public static void rev(int n1,int n2)
	{
		for(int i=n2;i>=n1;i--)
		{
			System.out.println(i);
		}
	}

}