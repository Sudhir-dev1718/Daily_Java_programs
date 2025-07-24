import java.util.*;
class taskmedthod4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		double base=sc.nextDouble();
		
		System.out.println("enter heigth");
		double heigth=sc.nextDouble();
		
		areaOfTriangle(base,heigth);
		
		
	}
	
	
	public static void areaOfTriangle(double base,double heigth)
	{
	          System.out.print((0.5*base*heigth));
	}
}