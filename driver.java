import graphics.*;
import java.util.*;
class driver
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int c;
		circle obj1 = new circle();
		rectangle obj2 = new rectangle();
		square obj3 = new square();
		triangle obj4 = new triangle();
		System.out.println("Select 1) Circle 2) Rectangle 3) Square 4) triangle");
		c=sc.nextInt();
		switch(c)
		{
			case 1: obj1.area(); break;
			case 2: obj2.area(); break;
			case 3: obj3.area(); break;
			case 4: obj4.area(); break;
			default: break;
		}
	}
}
