import java.util.*;
public class employeemain
{
	public static void main(String args[])
	{
		int count,i;
		int eno,salary;
		String ename;
		int key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of employees");
		count=sc.nextInt();
		employee[] obj = new employee[count];
		System.out.println("enter employee details");
		for(i=0;i<count;i++)
		{
			System.out.println("Enter employee No");
			eno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee Name");
			ename=sc.nextLine();
			System.out.println("Enter employee Salary");
			salary=sc.nextInt();
			obj[i] = new employee(eno,ename,salary);
		}
		System.out.println("Enter the employee no to search");
		key=sc.nextInt();
		int flag=0;
		for(i=0;i<count;i++)
		{
			if(key==obj[i].eno)
			{
				flag=1;
				break;
			}
			if(flag==0)
				System.out.println("employee is not present");
			else
				System.out.println("Employee is present");
		}
	}
}
class employee
{
	int eno,salary;
	String ename;
	employee(int eid,String ename,int salary);
	{
		eno=eid;
		ename=ename;
		salary=salary;
	}
}		




