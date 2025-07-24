import java.util.*;
class taskmedthod6
{
	public static void main(String[] args)
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter side");
		double side=sc.nextDouble();
		areaOfSquare(side);
		
	}
	
	public static void areaOfSquare(double side)
	{
		System.out.print(side*side);
	}
}