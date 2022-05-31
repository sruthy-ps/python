import java.util.*;
class employee
{
	int empid;
	String name;
	double salary;
	String address;
	employee(int no,String na,double sal,String add)
	{
		this.empid=no;
		this.name=na;
		this.salary=sal;
		this.address=add;
	}
}
public class teacher extends employee
{
	String dept;
	String subject;
	teacher(int no,String na,double sal,String add,String dep,String sub)
	{
		super(no,na,sal,add);
		this.dept=dep;
		this.subject=sub;
	}
	void display()
	{
		System.out.println("\nEmployee id:"+empid);
		System.out.println("\nName:"+name);
		System.out.println("\nSalary:"+salary);
		System.out.println("\nAddress:"+address);
		System.out.println("\nDepartment:"+dept);
		System.out.println("\nSubject:"+subject);
	}
	public static void main(String args[])
	{
		System.out.println("Enter the no employees");
		Scanner sc1 = new Scanner(System.in);
		int num=sc1.nextInt();
		teacher arr[]=new teacher[num];
		for(int i=0;i<num;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter Employee Id:");
			int empid=sc.nextInt();
			System.out.println("\nEnter Employee name");
			String name=sc.next();
			System.out.println("\nEnter Salary");
			double salary=sc.nextDouble();
			System.out.println("\nEnter Address");
			String address=sc.next();
			System.out.println("\nEnter Department");
			String dept=sc.next();
			System.out.println("\nEnter subject");
			String subject=sc.next();
			arr[i]=new teacher(empid,name,salary,address,dept,subject);
			
		}
		System.out.println("\n***************Employee Details****************");
		for(int i=0;i<num;i++)
		{
			int j=i+1;
			System.out.println("\n"+j+".");
			arr[i].display();
		}
		sc1.close();
	}
}
