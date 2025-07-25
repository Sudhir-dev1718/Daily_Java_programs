import java.util.*;
class Formating
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			
		String a=sc.nextLine();
		int d=sc.nextInt();
		System.out.printf("%-15s%03d%n",a,d);
		}
		
	}
}