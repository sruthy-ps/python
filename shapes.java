import java.util.*;
public class shapes
{
	void area(int a)
	{
		double area_val=3.14*a*a;
		System.out.println("Area of circle "+area_val);
	}
	void area(int b,int c)
	{
		int area_val=b*c;
		System.out.println("Area of rectangle "+area_val);
	}
	void area(int b,int c,int d)
	{
		int area_val=b*c*d;
		System.out.println("Area of cuboid "+area_val);
	}
	public static void main(String arga[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the Breadth");
		int b=sc.nextInt();
		System.out.println("Enetr the height");
		int h=sc.nextInt();
		System.out.println("Enter the Radius");
		int r=sc.nextInt();
		shapes obj=new shapes();
		obj.area(r);
		obj.area(l,b);
		obj.area(l,b,h);
	}
}
