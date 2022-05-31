import java.util.*;
class operations
{
	void operation()
	{
		int top=-1,eh,n,e;
		Scanner inp = new Scanner(System.in);	
		System.out.println("Entr the size of the Stack");
		n=inp.nextInt();
		int size=n-1;
		int[] arr=new int[n];
		do
		{
			System.out.println("\n======\n MENU: \n 1.Push \n 2.Pop \n 3.Display \n 4.Exit======\n");
			System.out.println("Enter your choice");
			ch=inp.nextInt();
			switch(ch)
			{
				case 1: if(top==size)
					{
						System.out.println("***Stack is full***");
					}
					else
					{
						System.out.println("Enter Element");
						e=inp.nextInt();
						top++;
						arr[top]=e;
					}
					break;
				case 2: if(top==-1)
					{
						System.out.println("Stack is empty");
					}
					else
					{
						System.out.println("\n"+arr[top]"is removed");
						top--;
					}
					break;
				case 3: if(top==-1)
					{
						System.out.println("***Stack is empty***");
					}
					else
					{
						System.out.println("\n***Stack:***\n");
						for(int i=top;i>=0;i--)
`						{
							System.out.println(" "+arr[i]);
							System.out.println("------");
						}
					}
					break;
				case 4:System.exit(0);
				default: System.out.println("Invalid choice");
			}
		}
		while(ch!=4);
	}
}
class driver
{
	public static void main(String args[])
	{
		operations obj=new operations();
		obj.operations();
	}
}
			
					
