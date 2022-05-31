import java.util.Scanner;
class stringfn
{
	public static void main(String args[])
	{
		System.out.println("Enter the 1st string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the 2nd string");
		String str1 = sc.nextLine();
		System.out.println("Length of string ="+str.length());
		System.out.println("Character at 1st postion ="+str.charAt(1));
		System.out.println("String contain 'col' sequence ="+str.contains("col"));
		System.out.println("Srting ends with e ="+str.endsWith("e"));
		System.out.println("Replace 'col' with 'kol' ="+str.replaceAll("col","kol"));
		System.out.println("Concat String ="+str.concat(str1));
		System.out.println("To uppercase ="+str.toUpperCase());
		System.out.println("To lowercase ="+str.toLowerCase());
	}
}
