class CPU
{
	int price;
	CPU(int p)
	{
		price=p;
	}
	class Processer
	{
		int core;
		String man;
	Processer(int c,String manu)
	{
		core=c;
		man=manu;
	}
	void display()
	{
		System.out.println("Cores="+core);
		System.out.println("Processer Manufact.="+man);
	}
        }
static class RAM
{
	int memory;
	String manfact;
	RAM(int m,String manf)
	{
		memory=m;
		manfact=manf;
	}
	void disp()
	{
		System.out.println("RAM is="+memory);
		System.out.println("RAM Manifact="+manfact);
	}
}
}
public class computer
{
	public static void main(String args[])
	{
		CPU cpu=new CPU(3000);
		CPU.Processer processer=cpu.new Processer(5,"intel");
		CPU.RAM ramobj=new CPU.RAM(2,"intel");
		processer.display();
		ramobj.disp();
	}
}
