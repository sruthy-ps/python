import java.util.*;
class driverthread
{
	public static void main(String args[]) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower limit of range");
		int x=sc.nextInt();
		System.out.println("Enter the upper limit of range");
		int y=sc.nextInt();
		Runnable r=new fibinocci(x,y);
		Thread obj1=new Thread(r);
		obj1.start();
		obj1.sleep(500);
		Runnable p=new even(x,y);
		Thread obj2=new Thread(p);
		obj2.start();
	}
}

class even implements Runnable
{
	int n1;
	int n2;
	even(int x,int y)
	{
		n1=x;
		n2=y;
	}
	@Override
	public void run()
	{
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0)
			{
				System.out.println("even ="+i);
			}
		}
	}
}

class fibinocci implements Runnable
{
	int n1;
	int n2;
	int num=0;
	int x=0;
	int y=1;
	fibinocci(int l,int u)
	{
		n1=l;
		n2=u;
	}
	@Override
	public void run()
	{
		System.out.println("Fibinocci ="+0);
		System.out.println("Fibinocci ="+1);
		while (num < n2-1)
		{
			num=x+y;
			if((num>=n1)&&(num<=n2))
			{
				System.out.println("Fibinocci ="+num);
			}
			x=y;
			y=num;
		}
	}
}
