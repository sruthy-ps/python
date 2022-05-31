import java.util.Scanner;
import java.util.Arrays;
class stringsort
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no words");
		int num=sc.nextInt();
		String word[]=new String[num];
		System.out.println("entre a word");
		sc.nextLine();
		for(i=0;i<num;i++)
		{
			word[i]=sc.nextLine();
		}
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(word[i].compareTo(word[j])>0)
				{
					String temp=word[i];
					word[i]=word[j];
					word[j]=temp;
				}
			}
		}
		System.out.println("Sorted strings using compare to function "+Arrays.toString(word));
	}
}
